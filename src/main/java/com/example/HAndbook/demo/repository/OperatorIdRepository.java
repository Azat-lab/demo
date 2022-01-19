package com.example.HAndbook.demo.repository;

import com.example.HAndbook.demo.entity.OperatorId;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public interface OperatorIdRepository extends JpaRepository<OperatorId, Long> {

    OperatorId findByTelekomOperatorAAndOperatorNameIdAndOperatorCodeAndOperatorCountry(String telekomOperator,
                                                                                        int operatorNameId, int operatorCode,
                                                                                        String operatorCountry);


}
