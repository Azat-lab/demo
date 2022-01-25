package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Country getByName(String country);
    Optional<Country> findById(Long id);
    void save(Country country);
    void delete(Long id);
    List<Country> getAll();



//    Optional<Country> save(Country country);
//    List<Country> saveAllCountries(List<Country> countries);
//    Optional<Country> update(Country country);
//    Optional<Country> get(Long id);
//    List<Country> getAll();
//    Boolean findById(Long id);
//    Boolean deleteById(Long id);
//    Boolean deleteAll();

//    Country saveCountry(Country country);
//    void deleteCountry(Long id);
//    Country getByCountryName(String name);
//    List<Country> getAll();
}
