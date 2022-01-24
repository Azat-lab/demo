package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Person;

import java.util.List;

public interface IPersonService {
    Person savePersonByName(Person person);
    Iterable<? extends Integer> deletePersonId(Long id);
    List<Person> getByPersonId(Long personId);
    List<Person> getAll();

}
