package com.hobbymap;

public class LeagueMapper {
    public static LeagueDTO toDto(League league){
        return LeagueDTO.builder()
                .city(league.getCity())
                .format(league.getFormat())
                .name(league.getName())
                .weekday(league.getWeekday())
                .latitude(league.getLatitude())
                .longitude(league.getLatitude())
                .facebookLink(league.getFacebookLink())
                .instagramLink(league.getInstagramLink())
                .personOfContact(league.getPersonOfContact())
                .personOfContactPhone(league.getPersonOfContactPhone())
                .siteLink(league.getSiteLink())
                .whatsappLink(league.getWhatsappLink())
                .build();
    }
}
