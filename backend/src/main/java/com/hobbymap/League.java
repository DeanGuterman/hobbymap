package com.hobbymap;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


// Represent a league (hobby group) for the database table
@Entity
@Getter
@Setter
@NoArgsConstructor // Required by JPA
@AllArgsConstructor
@Builder
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitude;
    private Double longitude;

    private String name;
    private String city;

    private Format format; // EDH, Standard, Modern, Limited etc
    private Weekday weekday; // Should be enum

    private String personOfContact;
    private String personOfContactPhone;

    private String siteLink;
    private String whatsappLink;
    private String facebookLink;
    private String instagramLink;

    private String notes; // Additional relevant information

}
