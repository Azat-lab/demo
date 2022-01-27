package com.example.HAndbook.demo.repository;



import com.example.HAndbook.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
//    void savePersonByPersonNameAndPersonSurname(String personName, String personSurname);

    List<Person> findByPersonNameOrPersonSurname(String personName, String personSurname);//+
    Optional<Person> findById(Integer personId);//+
    Optional<Person> findByNumber(Integer phoneNumber);//+
    void deleteById(Integer pesronId);
    List<Person> findAll();

}
