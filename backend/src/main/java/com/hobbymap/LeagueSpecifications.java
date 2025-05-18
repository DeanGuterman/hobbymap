package com.hobbymap;

import org.springframework.data.jpa.domain.Specification;


// Helper class to create JPA Specifications for League entity
public class LeagueSpecifications {

    // Each method creates a specification to filter by

    public static Specification<League> filterByCity(String city){
        // root is the root entity, meaning League
        // query is the query being built
        // cb is the CriteriaBuilder, to construct criteria predicates
        return (root, query, cb) -> { // Lambda expression for toPredicate
            if (city == null) return null;
            return cb.equal(root.get("city"), city); // Equality predicate
        };
    }

    public static Specification<League> filterByFormat(String format){
        return (root, query, cb) -> {
            if (format == null) return null;
            return cb.equal(root.get("format"), Format.valueOf(format.toUpperCase()));
        };
    }

    public static Specification<League> filterByName(String name){
        return (root, query, cb) -> {
            if (name == null) return null;
            return cb.equal(root.get("name"), name);
        };
    }

    public static Specification<League> filterByWeekday(String weekday){
        return (root, query, cb) -> {
            if (weekday == null) return null;
            return cb.equal(root.get("weekday"), Format.valueOf(weekday.toUpperCase()));
        };
    }
}
