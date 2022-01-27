package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Person;

import java.util.List;

public interface PersonService {
    Person saveByName(Person person);
    Iterable<? extends Integer> deletePerson(Long id);
    Long getByPersonId(Long personId);
    void delete(Long id);
    List<Person> getAll();

}
