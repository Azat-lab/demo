package com.example.HAndbook.demo.service;

public class Handbook {
    private int person_id;
    private String person_name;
    private String person_surname;
    private int phone_number;

    public Handbook(int person_id,
                    String person_name,
                    String person_surname,
                    String phone_number) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.person_surname = person_surname;
        this.phone_number = Integer.parseInt(phone_number);
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_firstname() {
        return person_name;
    }

    public void setPerson_firstname(String person_firstname) {
        this.person_name = person_name;
    }

    public String getPerson_lastname() {
        return person_surname;
    }

    public void setPerson_lastname(String person_lastname) {
        this.person_surname = person_lastname;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Handbook{" +
                "person_id=" + person_id +
                ", person_firstname='" + person_name + '\'' +
                ", person_lastname='" + person_surname + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}

