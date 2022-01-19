package com.example.HAndbook.demo;

import com.example.HAndbook.demo.entity.Country;

import java.util.List;
import java.util.Optional;

public interface HandbookService {
    void add(Country country);
    void save(Country country);
    void delete(long Id);
    void search(long id);
    void update(Country country);

    List<Country> getCountry();
    Optional<Country> findById(long Id);

    Optional<Country> findByName(String name);
}
