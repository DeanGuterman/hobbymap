package com.hobbymap.service;

import com.hobbymap.domain.Format;
import com.hobbymap.domain.League;
import com.hobbymap.domain.Weekday;
import com.hobbymap.repository.LeagueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.hobbymap.specification.LeagueSpecifications.*;


// Service for League related business logic
@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    // Get leagues filtered by optional criteria
    public List<League> getLeagues(String city, Format format, String name, Weekday weekday){
        return leagueRepository.findAll(filterByCity(city)
                .and(filterByFormat(format))
                .and(filterByName(name))
                .and(filterByWeekday(weekday))
        );
    }
}
