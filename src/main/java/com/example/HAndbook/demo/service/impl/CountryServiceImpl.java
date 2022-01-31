package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.repository.CountryRepository;
import com.example.HAndbook.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;


}
