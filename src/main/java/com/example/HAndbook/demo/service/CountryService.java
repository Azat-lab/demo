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

}
