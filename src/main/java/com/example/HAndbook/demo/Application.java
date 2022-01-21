package com.example.HAndbook.demo;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.entity.Handbook;
import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.service.CountryService;
import com.example.HAndbook.demo.service.HandbookService;
import com.example.HAndbook.demo.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;

public class Application {
    @Autowired
    CountryService countryService;

    public void save(Country country){
        countryService.save(country);

    }
//    public void delete(Country country){
//    countryService.delete(country.getCountryAreaCodeId());
//   }
    @Autowired
    HandbookService handbookService;

    public void save(Handbook handbook){
        handbookService.save(handbook);}

//    void delete(Handbook handbook){
//        handbookService.delete(handbook);
//    }

    @Autowired
    OperatorService operatorService;

    public void save(Operator operator){
        operatorService.save(operator);
    }

}

