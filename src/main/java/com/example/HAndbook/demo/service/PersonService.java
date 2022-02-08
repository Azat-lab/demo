package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findByPersonNameOrPersonSurname(String personName, String personSurname);//+
    Optional<Person> findByPersonId(Integer personId);//+
    Optional<Person> findByPhoneNumber(Integer phoneNumber);//+
    void deleteByPersonId(Integer personId);
    List<Person> findAll();
    Person savePersonById(Long id);

}
