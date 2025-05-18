package com.hobbymap.repository;

import com.hobbymap.domain.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

// JPA repository for league lookups
public interface LeagueRepository extends JpaRepository<League, Long>, JpaSpecificationExecutor<League> {

}
