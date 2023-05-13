package com.sinemturkcu.countryproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "country")

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

    public Country() {
    }

    public Country(Long id, String name, String president) {
        this.id = id;
        this.name = name;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}
