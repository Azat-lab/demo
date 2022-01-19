package com.example.HAndbook.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "operator_id")
public class OperatorId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "telekom_operator")
    private String telekomOperator;

    @Column(name = "operator_name_id")
    private int operatorNameId;

    @Column(name = "operator_code")
    private int operatorCode;

    @Column(name = "operator_country")
    private String operatorCountry;


    public String getTelekomOperator() {
        return telekomOperator;
    }

    public void setTelekomOperator(String telekomOperator) {
        this.telekomOperator = telekomOperator;
    }

    public int getOperatorNameId() {
        return operatorNameId;
    }

    public void setOperatorNameId(int operatorNameId) {
        this.operatorNameId = operatorNameId;
    }

    public int getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(int operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperatorCountry() {
        return operatorCountry;
    }

    public void setOperatorCountry(String operatorCountry) {
        this.operatorCountry = operatorCountry;
    }

    public OperatorId() {

    }

    public OperatorId(String telekomOperator,
                      int operatorNameId, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorNameId = operatorNameId;
        this.operatorCountry = operatorCountry;
    }

    public OperatorId(String telekomOperator, int operatorCode,
                      int operatorNameId, String operatorCountry) {
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
        OperatorId operatorId = (OperatorId) ob;
        return Objects.equals(telekomOperator, operatorId.telekomOperator) &&
                Objects.equals(operatorCode, operatorId.operatorCode) &&
                Objects.equals(operatorNameId, operatorId.operatorNameId) &&
                Objects.equals(operatorCountry, operatorId.operatorCountry);
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