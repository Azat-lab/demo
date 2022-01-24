package com.example.HAndbook.demo.repository;

import com.example.HAndbook.demo.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IOperatorRepository extends JpaRepository<Operator, Long> {
    List<Operator> findByOperatorId(Long operatorId);

   // List<Operator> findAllByOperatorCountry(String operatorCountry);

}
