package com.sinemturkcu.countryproject.dto.request;

import lombok.Getter;
import lombok.Setter;


public class CountryDtoRequest {
    private String name;
    private String president;

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
