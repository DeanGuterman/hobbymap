package com.hobbymap;

import org.springframework.data.jpa.domain.Specification;

public class LeagueSpecifications {

    static public Specification<League> filterByCity(String city){
        return (root, query, criteriaBuilder) -> {
            if (city == null) return null;
            return criteriaBuilder.equal(root.get("city"), city);
        };
    }

    static public Specification<League> filterByFormat(String format){
        return (root, query, criteriaBuilder) -> {
            if (format == null) return null;
            return criteriaBuilder.equal(root.get("city"), format);
        };
    }

    static public Specification<League> filterByName(String name){
        return (root, query, criteriaBuilder) -> {
            if (name == null) return null;
            return criteriaBuilder.equal(root.get("city"), name);
        };
    }

    static public Specification<League> filterByWeekday(String weekday){
        return (root, query, criteriaBuilder) -> {
            if (weekday == null) return null;
            return criteriaBuilder.equal(root.get("city"), weekday);
        };
    }
}
