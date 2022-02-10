package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findByPersonNameOrPersonSurname(String personName, String personSurname);//+
    Optional<Person> findByPersonId(Long personId);//+
    Optional<Person> findByPhoneNumber(Integer phoneNumber);//+
    void deleteByPersonId(Long personId);
    Person savePersonById(Long personId);


}
