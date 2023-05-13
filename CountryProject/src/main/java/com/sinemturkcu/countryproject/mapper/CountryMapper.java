package com.sinemturkcu.countryproject.mapper;

import com.sinemturkcu.countryproject.dto.request.CountryDtoRequest;
import com.sinemturkcu.countryproject.dto.response.CountryDtoResponse;
import com.sinemturkcu.countryproject.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
    Country countryDtoRequestToCountry(CountryDtoRequest countryDtoRequest);
    Country countryDtoResponseToCountry(CountryDtoResponse countryDtoResponse);
    CountryDtoRequest countryToCountryDtoRequest(Country country);
    CountryDtoResponse countryToCountryDtoResponse(Country country);



}
