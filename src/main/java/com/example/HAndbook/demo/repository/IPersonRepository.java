package com.example.HAndbook.demo.repository;



import com.example.HAndbook.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IPersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByPersonId(Long personId);

}
