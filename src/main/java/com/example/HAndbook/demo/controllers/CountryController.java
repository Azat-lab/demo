package com.example.HAndbook.demo.controllers;


import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping(value = "{countryAreaCodeId}", method = RequestMethod.GET)
    public ResponseEntity<Country> getCountry(@PathVariable("countryAreaCodeId") Long countryId){
        if(countryId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Country country = this.countryService.getByName(String.valueOf(countryId));

        if(country == null){
            return new ResponseEntity<Country>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Country>(country, HttpStatus.OK);
    }}




//    @PostMapping
//    public ResponceEntity<Country> save(RequestBody Country countries){
//        return countryService.save(country).map(u -> new ResponseEntity(u, HttpStatus.OK))
//                .orElseThrow(() -> new CountryException(String.format(ErrorType.Country_NOT_SAVED.getDescription(), country.toString)));
//    }

