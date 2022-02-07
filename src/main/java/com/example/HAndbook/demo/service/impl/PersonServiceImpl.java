package com.example.HAndbook.demo.service.impl;


import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.PersonRepository;
import com.example.HAndbook.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> findByPersonNameOrPersonSurname(String personName, String personSurname) {
        return null;
    }

    @Override
    public Optional<Person> findByPersonId(Integer personId) {
        return Optional.empty();
    }

    @Override
    public Optional<Person> findByPhoneNumber(Integer phoneNumber) {
        return Optional.empty();
    }

    @Override
    public void deleteByPersonId(Integer personId) {

    }

    @Override
    public List<Person> findAll() {
        return null;
    }
}




