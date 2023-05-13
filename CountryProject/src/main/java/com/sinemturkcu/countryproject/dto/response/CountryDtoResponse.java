package com.sinemturkcu.countryproject.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;


public class CountryDtoResponse {
    private Long id;
    private String name;
    private String president;

    public CountryDtoResponse() {
    }

    public CountryDtoResponse(Long id, String name, String president) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}
