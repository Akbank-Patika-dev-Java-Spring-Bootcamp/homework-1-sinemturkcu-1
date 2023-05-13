package com.sinemturkcu.countryproject.service;

import com.sinemturkcu.countryproject.dto.request.CountryDtoRequest;
import com.sinemturkcu.countryproject.dto.response.CountryDtoResponse;


import java.util.List;

public interface CountryService {
    CountryDtoResponse saveCountry(CountryDtoRequest countryDtoRequest);
    List<CountryDtoResponse> getAllCountries();
    CountryDtoResponse getCountryById(Long id);
    CountryDtoResponse updatePresident(Long id, String name);
    void deleteCountry(Long id);

}
