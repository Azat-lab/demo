package com.example.HAndbook.demo.repository;

import com.example.HAndbook.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByCountryAreaCodeIdAndCountryNameAndAddress(long countryAreaCodeId, String countryName, String Address);

}

