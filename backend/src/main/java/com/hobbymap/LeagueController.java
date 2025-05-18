package com.hobbymap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// REST controller for League related endpoints
@RestController
public class LeagueController {
    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService){
        this.leagueService = leagueService;
    }

    // Endpoint to get leagues with optional filtering by query parameters
    @GetMapping("/leagues")
    public ResponseEntity<List<LeagueDTO>> getLeagues(
            @RequestParam(required = false) String city,
            @RequestParam(required = false) Format format, // Spring handles conversion
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Weekday weekday
    ){

        List<League> leagues = leagueService.getLeagues(city, format, name, weekday);
        List<LeagueDTO> leaguesDTO = leagues.stream()
                .map(LeagueMapper::toDto)
                .toList();
        return ResponseEntity.ok(leaguesDTO);
    }
}
