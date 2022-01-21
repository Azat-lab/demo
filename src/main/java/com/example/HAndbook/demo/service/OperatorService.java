package com.example.HAndbook.demo.service;


import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperatorService {
    @Autowired
    private OperatorRepository operatorRepository;

    public Operator save(Operator operator){
        return operatorRepository.save(operator);
    }
    public Operator findById(Long id){
        return  operatorRepository.findById(id).orElseThrow();
    }
}
