package com.hobbymap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LeagueController {
    private final LeagueRepository leagueRepository;

    public LeagueController(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    @GetMapping("/leagues")
    public ResponseEntity<List<League>> getAllLeagues(){

    }
}
