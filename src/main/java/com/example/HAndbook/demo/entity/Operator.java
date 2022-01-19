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
    @Column(name = "operator_name_id") // operator
    private Long operatorNameId;

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

    public Long getOperatorNameId() {
        return operatorNameId;
    }

    public void setOperatorNameId(Long operatorNameId) {
        this.operatorNameId = operatorNameId;
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
                    Long operatorNameId, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorNameId = operatorNameId;
        this.operatorCountry = operatorCountry;
    }

    public Operator(String telekomOperator, Integer operatorCode,
                    Long operatorNameId, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorCode = operatorCode;
        this.operatorNameId = operatorNameId;
        this.operatorCountry = operatorCountry;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass())
            return false;
        Operator operatorId = (Operator) ob;
        return Objects.equals(telekomOperator, operatorId.telekomOperator) &&
                Objects.equals(operatorCode, operatorId.operatorCode) &&
                Objects.equals(operatorNameId, operatorId.operatorNameId) &&
                Objects.equals(operatorCountry, operatorId.operatorCountry);

    }

    @Override
    public int hashCode() {
        int result = telekomOperator != null ? telekomOperator.hashCode() : 0;
        result = 31 * result + (operatorNameId != null ? operatorNameId.hashCode() : 0);
        result = 31 * result + (operatorCode != null ? operatorCode.hashCode() : 0);
        result = 31 * result + (operatorCountry != null ? operatorCountry.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OperatorId{" +
                "telekomOperator='" + telekomOperator + '\'' +
                ", operatorNameId=" + operatorNameId +
                ", operatorCode=" + operatorCode +
                ", operatorCountry='" + operatorCountry + '\'' +
                '}';
    }
}