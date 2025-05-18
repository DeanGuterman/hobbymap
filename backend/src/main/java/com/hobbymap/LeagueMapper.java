package com.hobbymap;

public class LeagueMapper {
    public static LeagueDTO toDto(League league){
        return LeagueDTO.builder()
                .city(league.getCity())
                .format(league.getFormat())
                .name(league.getName())
                .weekday(league.getWeekday())
                .build();
    }
}
