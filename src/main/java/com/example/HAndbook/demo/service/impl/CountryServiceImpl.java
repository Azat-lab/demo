package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.repository.ICountryRepository;
import com.example.HAndbook.demo.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements ICountryService {

    private final ICountryRepository iCountryRepository;
    @Autowired
    public CountryServiceImpl(ICountryRepository iCountryRepository){
        this.iCountryRepository = iCountryRepository;
    }

    @Override
    public Country saveCountry(Country country) {
        Country savedCountry = iCountryRepository.saveAndFlush(country);
        return savedCountry;
    }

    @Override
    public void deleteCountry(Long id) {
        iCountryRepository.deleteById(id);
    }

    @Override
    public Country getByCountryName(String name) {
        return null;
    }

    @Override
    public List<Country> getAll() {
        return  iCountryRepository.findAll();
    }
}
