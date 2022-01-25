package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.PersonRepository;
import com.example.HAndbook.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Person createPerson(Person person) {
        Person createPerson = (Person) personRepository.createPersonList(person.getPersonName(), person.getPersonSurname());
        return null;
    }

    @Override
    public Person savePersonByName(Person person) {
        Person savedPersonName = personRepository.saveAndFlush(person);
        return savedPersonName;
    }

    @Override
    public Iterable<? extends Integer> deletePerson(Long id) {
        personRepository.deleteByPersonId(deletePerson(getByPersonId(id)));

        return deletePerson(id);
    }

    @Override
    public Long getByPersonId(Long personId) {
        return  personRepository.findByPersonId(personId); // позже пофиксить
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
