package com.hobbymap.dto;

import com.hobbymap.domain.Format;
import com.hobbymap.domain.Weekday;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class LeagueDTO {
    private String city;
    private Format format;
    private String name;
    private Weekday weekday;
    private double latitude;
    private double longitude;
    private String personOfContact;
    private String personOfContactPhone;
    private String siteLink;
    private String whatsappLink;
    private String facebookLink;
    private String instagramLink;

}
