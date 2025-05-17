package com.hobbymap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {
    private final LeagueRepository leagueRepository;
    private final LeagueService leagueService;

    public LeagueController(LeagueRepository leagueRepository, LeagueService leagueService){
        this.leagueRepository = leagueRepository;
        this.leagueService = leagueService;
    }

    @GetMapping("/leagues")
    public ResponseEntity<List<League>> getLeagues(
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String format,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String weekday
    ){
        List<League> leagues = leagueService.getAllLeagues();
        return ResponseEntity.ok(leagues);
    }
}
