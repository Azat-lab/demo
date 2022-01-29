package com.example.HAndbook.demo.repository;


import com.example.HAndbook.demo.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OperatorRepository extends JpaRepository<Operator, Long> {
    Optional<Operator> findById(Long operatorId);
    Optional<Operator> findByCode(Integer operatorCode);
    void deleteById(Long operatorId);
    List<Operator> saveOperator(String operatorCountry);

    // List<Operator> findAllByOperatorCountry(String operatorCountry);

}
