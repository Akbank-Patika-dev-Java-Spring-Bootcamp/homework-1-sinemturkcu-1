package com.sinemturkcu.countryproject.serviceImpl;

import com.sinemturkcu.countryproject.dto.request.CountryDtoRequest;
import com.sinemturkcu.countryproject.dto.response.CountryDtoResponse;
import com.sinemturkcu.countryproject.entity.Country;
import com.sinemturkcu.countryproject.mapper.CountryMapper;
import com.sinemturkcu.countryproject.mapper.CountryMapperImpl;
import com.sinemturkcu.countryproject.repository.CountryRepository;
import com.sinemturkcu.countryproject.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService {

    CountryRepository countryRepository;

    CountryMapper countryMapper = CountryMapper.INSTANCE;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public CountryDtoResponse saveCountry(CountryDtoRequest countryDtoRequest) {
        Country country = countryMapper.countryDtoRequestToCountry(countryDtoRequest);
        countryRepository.save(country);
        return countryMapper.countryToCountryDtoResponse(country);
    }

    @Override
    public List<CountryDtoResponse> getAllCountries() {
        return countryRepository.findAll()
                .stream()
                .map(country -> countryMapper.countryToCountryDtoResponse(country))
                .collect(Collectors.toList());
    }

    @Override
    public CountryDtoResponse getCountryById(Long id) {
        Country country = countryRepository.findById(id).orElseThrow();
        return countryMapper.countryToCountryDtoResponse(country);
    }

    @Override
    public CountryDtoResponse updatePresident(Long id, String name) {
        Country country = countryMapper.countryDtoResponseToCountry(this.getCountryById(id));
        country.setPresident(name);
        countryRepository.save(country);
        return countryMapper.countryToCountryDtoResponse(country);
    }

    @Override
    public void deleteCountry(Long id) {
        Country country = countryMapper.countryDtoResponseToCountry(this.getCountryById(id));
        countryRepository.delete(country);
    }
}
