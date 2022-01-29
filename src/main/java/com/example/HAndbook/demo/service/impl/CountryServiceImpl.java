package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.repository.CountryRepository;
import com.example.HAndbook.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

//    public CountryServiceImpl(CountryRepository countryRepository) {
//        this.countryRepository = countryRepository;
//    }
    // посмотреть позже!!!

    @Override
    public Country getByName(String country) {
        return null;
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }
    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }
    @Override
    public void delete(Long id) {
        countryRepository.deleteById(id);
    }
    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

//    public Optional<Country> save(Country country){
//        return Optional.of(countryRepository.save(country));
//    }

//    @Override
//    public Country saveCountry(Country country) {
//        Country savedCountry = countryRepository.saveAndFlush(country);
//        return savedCountry;
//    }
//
//    @Override
//    public void deleteCountry(Long id) {
//        countryRepository.deleteById(id);
//    }
//
//    @Override
//    public Country getByCountryName(String name) {
//        return (Country) countryRepository.findAll();
//    }
//
//    @Override
//    public List<Country> getAll() {
//        return  countryRepository.findAll();
//    }
}
