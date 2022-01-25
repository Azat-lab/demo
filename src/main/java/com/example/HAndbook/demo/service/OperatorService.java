package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Operator;

import java.util.List;
import java.util.Optional;

public interface OperatorService {

    Optional<Operator> findById(Long id);
    void save(Operator operator);
    void delete(Long id);
    Operator getById(Long id);
    List<Operator> getAll();
}
