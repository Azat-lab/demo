package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Person;

import java.util.List;

public interface PersonService {
    Long savePerson(Person person);
    Person getPerson(Long personId);
    Long updatePerson(Person person);
    Long deletePerson(Long personId);

}
