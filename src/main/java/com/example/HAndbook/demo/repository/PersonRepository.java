package com.example.HAndbook.demo.repository;



import com.example.HAndbook.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Long findByPersonId(Long personId);
    List<Person> findByPersonNameOrPersonSurname(String personName, String personSurname);
    List<Person> createPersonList(String personName, String personSurname);
    void deleteByPersonId(Iterable<? extends Integer> deletePersonId);
}
