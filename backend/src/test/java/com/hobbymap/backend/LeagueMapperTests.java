package com.hobbymap.backend;

import com.hobbymap.domain.League;
import com.hobbymap.domain.Weekday;
import com.hobbymap.domain.Format;
import com.hobbymap.dto.LeagueDTO;
import com.hobbymap.mapper.LeagueMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeagueMapperTests {

    @Test
    void testToDto(){
        League league = League.builder()
                .name("Test League")
                .city("Tel Aviv")
                .format(Format.COMMANDER)
                .weekday(Weekday.SUNDAY)
                .build();

        LeagueDTO dto = LeagueMapper.toDto(league);

        assertEquals("Test League", dto.getName());
        assertEquals("Tel Aviv", dto.getCity());
        assertEquals(Format.COMMANDER, dto.getFormat());
        assertEquals(Weekday.SUNDAY, dto.getWeekday());
    }
}
