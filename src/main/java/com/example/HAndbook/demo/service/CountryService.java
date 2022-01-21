package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

//    public CountryService (CountryRepository repository){
//        this.countryRepository = repository;
//    }
//    public List<Country> getAllCountry(){
//        return countryRepository.findAll();
//    }
//    public void save(Country country){
//        countryRepository.save(country);
//    }
//    public void delete(Long countryAreaCodeId){
//        countryRepository.deleteById(countryAreaCodeId);
//    }

    public Country save(Country country) {
        return (Country) countryRepository.save(country);
    }

//    public Country delete(Country country){
//        return countryRepository.deleteAll( );
//    }

   // public Country findById(Long id){
        //return  countryRepository.findById(id).orElseThrow();
    }

//}
