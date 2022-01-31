package com.example.HAndbook.demo.service.impl;

import com.example.HAndbook.demo.entity.Operator;
import com.example.HAndbook.demo.service.OperatorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperatorServiceImpl implements OperatorService {
    @Override
    public Optional<Operator> findById(Long id) {
        return Optional.empty();
    }
    @Override
    public void saveOperator(Operator operator, Long operatorId) {
    }
    @Override
    public void delete(Long id) {
    }
    @Override
    public Operator getById(Long id) {
        return null;
    }
    @Override
    public List<Operator> getAll() {
        return null;
    }
//    @PersistenceContext
//    EntityManager entityManager;
//
//    @Override
//    public void saveOperator(Operator operator, Long operatorId) {
//        Operator operatorPerson = entityManager
//                .createQuery("SELECT operator From Operator operator WHERE operator.operatorId=:id", Operator.class)
//                .setParameter("id", operatorId)
//                .getSingleResult();
//        operator.setOperatorId(operatorId);
//        entityManager.persist(operator);
//
//    }

}
