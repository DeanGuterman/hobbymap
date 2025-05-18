package com.hobbymap;

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
    private String format;
    private String name;
    private String weekday;

}
