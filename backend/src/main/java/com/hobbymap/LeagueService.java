package com.hobbymap;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.hobbymap.LeagueSpecifications.*;

@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }

    public List<League> getLeagues(String city, String format, String name, String weekday){
        return leagueRepository.findAll(filterByCity(city)
                .and(filterByFormat(format))
                .and(filterByName(name))
                .and(filterByWeekday(weekday))
        );
    }

    public List<League> getAllLeagues(){
        return leagueRepository.findAll();
    }

    public List<League> getAllLeaguesByCity(String city){
        return leagueRepository.findByCity(city);
    }

    public List<League> getAllLeaguesByFormat(String format){
        return leagueRepository.findByFormat(format);
    }

    public List<League> getAllLeaguesByName(String name){
        return leagueRepository.findByName(name);
    }

    public List<League> getAllLeaguesByWeekday(String weekday){
        return leagueRepository.findByWeekday(weekday);
    }

}
