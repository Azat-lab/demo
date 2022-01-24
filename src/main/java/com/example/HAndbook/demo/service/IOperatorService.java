package com.example.HAndbook.demo.service;

import com.example.HAndbook.demo.entity.Operator;

import java.util.List;

public interface IOperatorService {
    Operator saveOperator(Operator operator);
    void delete(Long id);
    Operator getById(Long id);
    List<Operator> getAll();
}
