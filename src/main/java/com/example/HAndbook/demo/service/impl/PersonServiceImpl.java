package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Person;
import com.example.HAndbook.demo.repository.IPersonRepository;
import com.example.HAndbook.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepository iPersonRepository;
    @Autowired
    public PersonServiceImpl(IPersonRepository iPersonRepository){
        this.iPersonRepository = iPersonRepository;
    }
    @Override
    public Person savePersonByName(Person person) {
        Person savedPersonName = iPersonRepository.saveAndFlush(person);
        return savedPersonName;
    }

    @Override
    public Iterable<? extends Integer> deletePersonId(Long id) {
        iPersonRepository.deleteAllById(deletePersonId(id));

        return deletePersonId(id);
    }

    @Override
    public List<Person> getByPersonId(Long personId) {
        return  iPersonRepository.findByPersonId(personId); // позже пофиксить
    }

    @Override
    public List<Person> getAll() {
        return iPersonRepository.findAll();
    }
}
