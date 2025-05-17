package com.hobbymap;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

// JPA repository for league lookups
public interface LeagueRepository extends JpaRepository<League, Long>, JpaSpecificationExecutor<League> {

}
