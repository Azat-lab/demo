package com.example.HAndbook.demo.service.impl;


import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.PersonRepository;
import com.example.HAndbook.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    @Override
    public Long savePerson(Person person) {
        return null;
    }

    @Override
    public Person getPerson(Long personId) {
        return null;
    }

    @Override
    public Long updatePerson(Person person) {
        return null;
    }

    @Override
    public Long deletePerson(Long personId) {
        return null;
    }
}


//
//     public PersonServiceImpl(PersonRepository personRepository){
//        this.personRepository = personRepository;
//        }



