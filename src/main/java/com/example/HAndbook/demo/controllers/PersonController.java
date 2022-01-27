package com.example.HAndbook.demo.controllers;

import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonController {
@Autowired
    PersonRepository personRepository;

@GetMapping("/person")
    public ResponseEntity<List<Person>> getAllPersons(@RequestParam(required = false)String personName, String personSurname){
    try{
        List<Person> persons = new ArrayList<Person>();
        if(personName == null && personSurname == null)
            personRepository.findAll().forEach(persons::add);
        else
            personRepository.findByPersonNameOrPersonSurname(personName, personSurname).forEach(persons::add);
        if(persons.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }catch (Exception e){
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
@GetMapping("/person/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable("id") Integer personId){
    Optional<Person> personData = personRepository.findById(personId);
    if(personData.isPresent()){
        return new ResponseEntity<>(personData.get(), HttpStatus.OK);
    }else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
@GetMapping("/person/{number}")
    public ResponseEntity<Person> getPersonByNumber(@PathVariable("phoneNumber") Integer phoneNumber){
    Optional<Person> personData = personRepository.findByNumber(phoneNumber);
    if(personData.isPresent()){
        return  new ResponseEntity<>(personData.get(), HttpStatus.OK);
    }else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
@DeleteMapping("/person")
    public ResponseEntity<HttpStatus> deletePerson(@PathVariable("id") Integer personId){
    try{
        personRepository.deleteById(personId);
        return new ResponseEntity<>(HttpStatus.GONE);
    }catch(Exception e){
        return new ResponseEntity<>(HttpStatus.GATEWAY_TIMEOUT);
    }
}
}



//    @Autowired
//    private final CountryService countryService;
//
//    public CountryController(CountryService countryService) {
//        this.countryService = countryService;
//    }
//
//    @RequestMapping(value = "{countryAreaCodeId}", method = RequestMethod.GET)
//    public ResponseEntity<Country> getCountry(@PathVariable("countryAreaCodeId") Long countryId){
//        if(countryId == null){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        Country country = this.countryService.getByName(String.valueOf(countryId));
//
//        if(country == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(country, HttpStatus.OK);
//    }}