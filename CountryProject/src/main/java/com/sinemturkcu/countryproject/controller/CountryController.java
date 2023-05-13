package com.sinemturkcu.countryproject.controller;

import com.sinemturkcu.countryproject.dto.request.CountryDtoRequest;
import com.sinemturkcu.countryproject.dto.response.CountryDtoResponse;
import com.sinemturkcu.countryproject.entity.Country;
import com.sinemturkcu.countryproject.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/country")

public class CountryController {

    CountryService countryService;


    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @PostMapping
    public ResponseEntity<CountryDtoResponse> saveCountry(@RequestBody CountryDtoRequest countryDtoRequest) {
        CountryDtoResponse countryDtoResponse = countryService.saveCountry(countryDtoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(countryDtoResponse);
    }

    @GetMapping
    public ResponseEntity<List<CountryDtoResponse>> getAllCountries() {
        List<CountryDtoResponse> countries = countryService.getAllCountries();
        return ResponseEntity.status(HttpStatus.OK).body(countries);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDtoResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(countryService.getCountryById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CountryDtoResponse> updatePresident(@PathVariable Long id,@RequestBody String name) {
      return ResponseEntity.ok(countryService.updatePresident(id,name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCountry(@PathVariable Long id) {
        countryService.deleteCountry(id);
        return ResponseEntity.ok("deleted");
    }





}
