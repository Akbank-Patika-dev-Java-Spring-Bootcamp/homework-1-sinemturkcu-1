package com.sinemturkcu.countryproject.repository;

import com.sinemturkcu.countryproject.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

}
