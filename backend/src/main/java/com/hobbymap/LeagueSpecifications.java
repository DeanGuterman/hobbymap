package com.hobbymap;

import org.springframework.data.jpa.domain.Specification;

public class LeagueSpecifications {

    public static Specification<League> filterByCity(String city){
        return (root, query, cb) -> {
            if (city == null) return null;
            return cb.equal(root.get("city"), city);
        };
    }

    public static Specification<League> filterByFormat(String format){
        return (root, query, cb) -> {
            if (format == null) return null;
            return cb.equal(root.get("city"), format);
        };
    }

    public static Specification<League> filterByName(String name){
        return (root, query, cb) -> {
            if (name == null) return null;
            return cb.equal(root.get("city"), name);
        };
    }

    public static Specification<League> filterByWeekday(String weekday){
        return (root, query, cb) -> {
            if (weekday == null) return null;
            return cb.equal(root.get("city"), weekday);
        };
    }
}
