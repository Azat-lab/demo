package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Country;

import java.util.List;

public interface ICountryService {
    Country saveCountry(Country country);
    void deleteCountry(Long id);
    Country getByCountryName(String name);
    List<Country> getAll();
}
