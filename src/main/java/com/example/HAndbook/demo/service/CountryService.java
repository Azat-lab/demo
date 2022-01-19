package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);

    }
    public Country findById(Long id){
        return  countryRepository.findById(id).orElseThrow();
    }

}
