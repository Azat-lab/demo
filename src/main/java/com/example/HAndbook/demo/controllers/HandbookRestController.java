package com.example.HAndbook.demo.controllers;

import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.service.CountryService;
import com.example.HAndbook.demo.service.OperatorService;
import com.example.HAndbook.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("api/handbook")
class HandbookRestController {
    private final PersonService personService;
    private final CountryService countryService;
    private final OperatorService operatorService;

    @Autowired
    HandbookRestController(PersonService personService, CountryService countryService, OperatorService operatorService) {
        this.personService = personService;
        this.countryService = countryService;
        this.operatorService = operatorService;
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(@RequestParam(required = false) String personName, String personSurname) {
        try {
            List<Person> persons = new ArrayList<Person>();
            if (personName == null && personSurname == null)
                persons.addAll(personService.findByPersonNameOrPersonSurname(null, null));
            else
                persons.addAll(personService.findByPersonNameOrPersonSurname(personName, personSurname));
            if (persons.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(persons, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/persons/id")
    public ResponseEntity<Person> getPersonById(@PathVariable Long personId) {
        Optional<Person> personData = personService.findByPersonId(personId);
        return personData.map(person -> new ResponseEntity<>(person, HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/persons/number")
    public ResponseEntity<Person> getPersonByNumber(@PathVariable("number") Integer phoneNumber) {
        Optional<Person> personData = personService.findByPhoneNumber(phoneNumber);
        return personData.map(person -> new ResponseEntity<>(person, HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/persons{id}")
    public ResponseEntity<HttpStatus> deletePerson(@PathVariable("id") Long personId) {
        try {
            personService.deleteByPersonId(personId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        try {
            Person _person = personService.savePersonById(person.getPersonId());
            return new ResponseEntity<>(_person, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
    }

    @GetMapping(value ="/country/{id}")
    public ResponseEntity<Country> getCountryByCountryAreaCodeId(@PathVariable("id") Long CountryAreaCodeId){
        Optional<Country> countryData = countryService.findByCountryAreaCodeId(CountryAreaCodeId);
        return countryData.map(country -> new ResponseEntity<>(country, HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/country/address")
    public ResponseEntity<Country> createCountry(@RequestBody Country country){
        try{
            Country _country = countryService.saveByCountryAreaCodeId(country.getCountryAreaCodeId());
            return  new ResponseEntity<>(_country, HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null, HttpStatus.OK);
        }
    }
    @GetMapping("/country/countryName")
    public ResponseEntity<List<Country>> findByCountryNameOrAddress(){
        try{
            List<Country> country = countryService.findByCountryNameAndAddress(" ", " ");
            if(country.isEmpty()){
                return new ResponseEntity<>(HttpStatus.CONTINUE);
            }
            return  new ResponseEntity<>(country, HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping(value ="/country/{id}")
    public ResponseEntity<HttpStatus> deleteCountry(@PathVariable("id") Long CountryAreaCodeId ){
        try{
            countryService.deleteByCountryAreaCodeId(CountryAreaCodeId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/operator/{id}")
    public ResponseEntity<Operator> getOperatorByOperatorId(@PathVariable("id") Long operatorId) {
        Optional<Operator> operatorData = operatorService.findByOperatorId(operatorId);
        return operatorData.map(operator -> new ResponseEntity<>(operator, HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping(value = "/operator/{id}")
    public ResponseEntity<HttpStatus> deleteOperatorId(@PathVariable("id") Long operatorId) {
        try {
            operatorService.deleteByOperatorId(operatorId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/operator/id")
    public ResponseEntity<Operator> getOperatorByCode(@PathVariable("id") Integer operatorCode) {
        Optional<Operator> operatorData = operatorService.findByOperatorCode(operatorCode);
        return operatorData.map(operator -> new ResponseEntity<>(operator, HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save/")
    public String saveOperatorCountry(@RequestBody Operator operator) {
        operatorService.saveOperator(operator.getOperatorCountry());
        return "Saved Operator...";
    }
}
