package com.sinemturkcu.countryproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "country")
@Data
public class Country {
    @SequenceGenerator(
            name = "generator",
            sequenceName = "id_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    private Long id;

    @Column(name = "country_name")
    private String name;

    @Column(name = "president_name")
    private String president;
}
