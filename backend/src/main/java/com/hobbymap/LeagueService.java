package com.hobbymap;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.hobbymap.LeagueSpecifications.*;


// Service for League related business logic
@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    // Get leagues filtered by optional criteria
    public List<League> getLeagues(String city, String format, String name, String weekday){
        return leagueRepository.findAll(filterByCity(city)
                .and(filterByFormat(format))
                .and(filterByName(name))
                .and(filterByWeekday(weekday))
        );
    }
}
