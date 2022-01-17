package com.example.HAndbook.demo.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operator_id {

    @Id
    private String telekom_operator;
    private int operator_code;
    private String operator_name;
    private String operator_country;

    public Operator_id(String telekom_operator,
                       int operator_code,
                       String operator_name,
                       String operator_country) {

        this.telekom_operator = telekom_operator;
        this.operator_code = operator_code;
        this.operator_name = operator_name;
        this.operator_country = operator_country;
    }

    public String getTelekom_operator() {
        return telekom_operator;
    }

    public void setTelekom_operator(String telekom_operator) {
        this.telekom_operator = telekom_operator;
    }

    public int getOperator_code() {
        return operator_code;
    }

    public void setOperator_code(int operator_code) {
        this.operator_code = operator_code;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    public String getOperator_country() {
        return operator_country;
    }

    public void setOperator_country(String operator_country) {
        this.operator_country = operator_country;
    }

    @Override
    public String toString() {
        return "Operator_id{" +
                "telekom_operator='" + telekom_operator + '\'' +
                ", operator_code=" + operator_code +
                ", operator_name='" + operator_name + '\'' +
                ", operator_country='" + operator_country + '\'' +
                '}';
    }
}
