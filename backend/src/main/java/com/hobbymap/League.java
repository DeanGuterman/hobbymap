package com.hobbymap;

import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private Format format; // EDH, Standard, Modern, Limited etc

    @Enumerated(EnumType.STRING)
    private Weekday weekday; // Sunday, Monday etc

    private String personOfContact;
    private String personOfContactPhone;

    private String siteLink;
    private String whatsappLink;
    private String facebookLink;
    private String instagramLink;

    private String notes; // Additional relevant information

}
