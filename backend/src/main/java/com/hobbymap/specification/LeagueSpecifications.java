package com.hobbymap.specification;

import com.hobbymap.domain.Format;
import com.hobbymap.domain.League;
import com.hobbymap.domain.Weekday;
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

    public static Specification<League> filterByFormat(Format format){
        return (root, query, cb) -> {
            if (format == null) return null;
            return cb.equal(root.get("format"), format);
        };
    }

    public static Specification<League> filterByName(String name){
        return (root, query, cb) -> {
            if (name == null) return null;
            return cb.equal(root.get("name"), name);
        };
    }

    public static Specification<League> filterByWeekday(Weekday weekday){
        return (root, query, cb) -> {
            if (weekday == null) return null;
            return cb.equal(root.get("weekday"), weekday);
        };
    }
}
