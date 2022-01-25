package com.example.HAndbook.demo.repository;

import com.example.HAndbook.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    List<Country> findByCountryName(String country);
    void findByCountryAreaCodeId(Long id);
    List<Country> findByAddress(String address);



//    @Query("select counrty from Country counrty where Country.CountryName = :name")
//    Country findByCountryName(@Param("countryName") String countryName);

    //Optional<Country> findByCountryAreaCodeId(Long CountryAreaCodeId);
    //Optional<Country> findByAddress(String address);
    //Optional<Country> findByCountryName(String countryName);


    //Object save(Country country);
//    void delete(Country country);



}
