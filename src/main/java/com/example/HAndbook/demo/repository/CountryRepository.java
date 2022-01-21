package com.example.HAndbook.demo.repository;

import com.example.HAndbook.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    //Optional<Country> findByCountryAreaCodeId(Long CountryAreaCodeId);
    //Optional<Country> findByAddress(String address);
    //Optional<Country> findByCountryName(String countryName);


    //Object save(Country country);
//    void delete(Country country);



}

