package com.example.HAndbook.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "operator")
public class Operator {

    @Column(name = "telekom_operator")
    private String telekomOperator;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operator_id") // operator
    private Long operatorId;

    @Column(name = "operator_code")
    private Integer operatorCode;

    @Column(name = "operator_country")
    private String operatorCountry;

    public String getTelekomOperator() {
        return telekomOperator;
    }

    public void setTelekomOperator(String telekomOperator) {
        this.telekomOperator = telekomOperator;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(Integer operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperatorCountry() {
        return operatorCountry;
    }

    public void setOperatorCountry(String operatorCountry) {
        this.operatorCountry = operatorCountry;
    }

    public Operator() {

    }

    public Operator(String telekomOperator,
                    Long operatorId, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorId = operatorId;
        this.operatorCountry = operatorCountry;
    }

    public Operator(String telekomOperator, Integer operatorCode,
                    Long operatorId, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorCode = operatorCode;
        this.operatorId = operatorId;
        this.operatorCountry = operatorCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        if (telekomOperator != null ? !telekomOperator.equals(operator.telekomOperator) : operator.telekomOperator != null)
            return false;
        if (operatorId != null ? !operatorId.equals(operator.operatorId) : operator.operatorId != null) return false;
        if (operatorCode != null ? !operatorCode.equals(operator.operatorCode) : operator.operatorCode != null)
            return false;
        return operatorCountry != null ? operatorCountry.equals(operator.operatorCountry) : operator.operatorCountry == null;
    }

    @Override
    public int hashCode() {
        int result = telekomOperator != null ? telekomOperator.hashCode() : 0;
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (operatorCode != null ? operatorCode.hashCode() : 0);
        result = 31 * result + (operatorCountry != null ? operatorCountry.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "telekomOperator='" + telekomOperator + '\'' +
                ", operatorId=" + operatorId +
                ", operatorCode=" + operatorCode +
                ", operatorCountry='" + operatorCountry + '\'' +
                '}';
    }
}