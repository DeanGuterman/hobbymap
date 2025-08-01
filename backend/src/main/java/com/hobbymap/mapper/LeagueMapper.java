package com.hobbymap.mapper;

import com.hobbymap.domain.League;
import com.hobbymap.dto.LeagueDTO;

public class LeagueMapper {
    public static LeagueDTO toDto(League league){
        if (league == null) return null;

        return LeagueDTO.builder()
                .city(league.getCity())
                .format(league.getFormat())
                .name(league.getName())
                .weekday(league.getWeekday())
                .latitude(league.getLatitude())
                .longitude(league.getLongitude())
                .facebookLink(league.getFacebookLink())
                .instagramLink(league.getInstagramLink())
                .personOfContact(league.getPersonOfContact())
                .personOfContactPhone(league.getPersonOfContactPhone())
                .siteLink(league.getSiteLink())
                .whatsappLink(league.getWhatsappLink())
                .build();
    }
}
