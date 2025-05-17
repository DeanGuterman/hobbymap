package com.hobbymap;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// JPA repository for league lookups
public interface LeagueRepository extends JpaRepository<League, Long> {
    List<League> findByName(String name);
    List<League> findByCity(String city);
    List<League> findByFormat(String format);
    List<League> findByWeekday(String weekday);

    List<League> findAll(Specification<League> spec);
}
