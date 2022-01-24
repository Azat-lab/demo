package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.repository.IOperatorRepository;
import com.example.HAndbook.demo.service.IOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorServiceImpl implements IOperatorService {

    private final IOperatorRepository iOperatorRepository;
    @Autowired
    public OperatorServiceImpl (IOperatorRepository iOperatorRepository){
        this.iOperatorRepository = iOperatorRepository;
    }


    @Override
    public Operator saveOperator(Operator operator) {
        Operator savedOperator = iOperatorRepository.saveAndFlush(operator);
        return savedOperator;
    }

    @Override
    public void delete(Long id) {
        iOperatorRepository.delete(getById(id));

    }

    @Override
    public Operator getById(Long id) {
        return null;
    }

    @Override
    public List<Operator> getAll() {
        return iOperatorRepository.findAll();
    }
}
