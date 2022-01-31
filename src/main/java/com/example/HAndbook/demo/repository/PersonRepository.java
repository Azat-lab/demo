package com.example.HAndbook.demo.repository;



import com.example.HAndbook.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;
@Component
public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByPersonNameOrPersonSurname(String personName, String personSurname);//+
    Optional<Person> findById(Integer personId);//+
    Optional<Person> findByNumber(Integer phoneNumber);//+
    void deleteById(Integer pesronId);
    List<Person> findAll();

}
