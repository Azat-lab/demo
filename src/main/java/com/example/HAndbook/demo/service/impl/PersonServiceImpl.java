package com.example.HAndbook.demo.service.impl;


import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.PersonRepository;
import com.example.HAndbook.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<Person> findByPersonId(Long personId) {
        return personRepository.findById(Math.toIntExact(personId));
    }
    @Override
    public Optional<Person> findByPhoneNumber(Integer phoneNumber) {
        return personRepository.findById(phoneNumber);
    }
    @Override
    public void deleteByPersonId(Long personId) {
        personRepository.deleteById(Math.toIntExact(personId));
    }

    @Override
    public Person savePersonById(Long personId) {
        personRepository.save(savePersonById(personId));

        return null;
    }

}




