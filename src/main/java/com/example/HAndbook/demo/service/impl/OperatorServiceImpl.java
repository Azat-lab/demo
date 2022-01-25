package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.repository.OperatorRepository;
import com.example.HAndbook.demo.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperatorServiceImpl implements OperatorService {
    private final OperatorRepository operatorRepository;
    @Autowired
    public OperatorServiceImpl(OperatorRepository operatorRepository) {
        this.operatorRepository = operatorRepository;
    }

    @Override
    public Optional<Operator> findById(Long id) {
        return operatorRepository.findById(id);
    }

    @Override
    public void save(Operator operator) {
        operatorRepository.save(operator);
    }
    @Override
    public void delete(Long id) {
        operatorRepository.deleteById(id);
    }

    @Override
    public Operator getById(Long id) {
        return operatorRepository.getById(id);
    }

    @Override
    public List<Operator> getAll() {
        return operatorRepository.findAll();
    }
}
