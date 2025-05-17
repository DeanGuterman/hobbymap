package com.hobbymap;

import org.springframework.data.jpa.domain.Specification;

public class LeagueSpecifications {
    static public Specification<League> filterByCity(String city){
        return (root, query, criteriaBuilder) -> {
            if (city == null) return null;
            return criteriaBuilder.equal(root.get("city"), city);
        };
    }
}
