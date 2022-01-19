package com.example.HAndbook.demo;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;

public class Apllication {
    @Autowired
    CountryService countryService;

    public void save(Country country){
        countryService.save(country);
    }

}

