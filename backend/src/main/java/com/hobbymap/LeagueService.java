package com.hobbymap;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    public List<League> getAllLeagues(){
        return leagueRepository.findAll();
    }
}
