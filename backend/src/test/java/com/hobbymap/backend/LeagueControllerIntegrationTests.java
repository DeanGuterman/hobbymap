package com.hobbymap.backend;

import com.hobbymap.domain.Format;
import com.hobbymap.domain.League;
import com.hobbymap.domain.Weekday;
import com.hobbymap.repository.LeagueRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class LeagueControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private LeagueRepository leagueRepository;

    @BeforeEach
    void setUp(){
        leagueRepository.deleteAll();

        League league = League.builder()
                .name("Tel Aviv Commander")
                .city("Tel Aviv")
                .format(Format.COMMANDER)
                .weekday(Weekday.WEDNESDAY)
                .latitude(32.0853)
                .longitude(34.7818)
                .build();

        leagueRepository.save(league);
    }

    @Test
    void testGetLeagues_byCity() throws Exception{
        mockMvc.perform(get("/leagues?city=Tel Aviv"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].city", is("Tel Aviv")))
                .andExpect(jsonPath("$[0].name", is("Tel Aviv Commander")));
    }
}
