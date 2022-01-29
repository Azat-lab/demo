package com.example.HAndbook.demo.service.impl;


import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person saveByName(Person person) {
        return null;
    }

    @Override
    public Iterable<? extends Integer> deletePerson(Long id) {
        return null;
    }
    @Override
    public Long getByPersonId(Long personId) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Person> getAll() {
        return null;
    }


//
//     public PersonServiceImpl(PersonRepository personRepository){
//        this.personRepository = personRepository;
//        }


}
