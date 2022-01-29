package com.example.HAndbook.demo.controllers;



import com.example.HAndbook.demo.entity.Country;
import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.CountryRepository;
import com.example.HAndbook.demo.repository.OperatorRepository;
import com.example.HAndbook.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3306")
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
@Bean
CommandLineRunner init(CountryRepository countryRepository, OperatorRepository operatorRepository, PersonRepository personRepository){
    return(evt) -> Arrays.asList(" ".split(",")).forEach(a->{
        Person person = personRepository.save(new Person());
        Country country = countryRepository.save(new Country());
        Operator operator = operatorRepository.save(new Operator());
    });

        }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
@RestController
@RequestMapping("/api")
class HandbookRestController {

    private final PersonRepository personRepository;
    private final CountryRepository countryRepository;
    private final OperatorRepository operatorRepository;
    @Autowired
    HandbookRestController(PersonRepository personRepository, CountryRepository countryRepository, OperatorRepository operatorRepository) {
        this.personRepository = personRepository;
        this.countryRepository = countryRepository;
        this.operatorRepository = operatorRepository;
    }

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
    @GetMapping("/person")
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
    @PostMapping("/person/{}")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        try{
            Person _person = personRepository.save(new Person(person.getPersonName(), person.getPersonSurname()));
            return new ResponseEntity<>(_person, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.GATEWAY_TIMEOUT);
        }
    }

    @GetMapping("country/")
    public ResponseEntity<List<Country>> getAllCountries(@RequestParam(required = false) String countryName, String address){
        try{
            List<Country> countries = new ArrayList<>();
            if(countryName == null && address == null)
                countryRepository.findAll().forEach(countries::add);
            else
                countryRepository.findByCountryNameAndAddress(countryName, address).forEach(countries::add);
            if(countries.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return  new ResponseEntity<>(countries, HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }
    @GetMapping("/country/{id}")
    public ResponseEntity<Country> getCountryByCountryAreaCodeId(@PathVariable("countryId") Long countryAreaCodeId, @PathVariable Long id){
        Optional<Country> countryData = countryRepository.findById(countryAreaCodeId);
        if(countryData.isPresent()){
            return  new ResponseEntity<>(countryData.get(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/country/{id}")
    public ResponseEntity<HttpStatus> deleteCountry(@PathVariable("id") Long countryAreaCodeId){
        try{
            countryRepository.deleteCountryById(countryAreaCodeId);
            return new ResponseEntity<>(HttpStatus.GONE);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.GATEWAY_TIMEOUT);
        }
    }
    @PostMapping("/country/{}")
    public ResponseEntity<Country> saveCountry(@RequestBody Country country){
        try{
            Country _country = countryRepository.saveCountry(new Country(country.getCountryName(), country.getAddress()));
            return new ResponseEntity<>(_country, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.GATEWAY_TIMEOUT);
        }
    }
}