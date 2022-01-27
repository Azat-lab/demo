package com.example.HAndbook.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long personId;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "person_surname")
    private String personSurname;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    public Person(String personName, String personSurname) {
    }


    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        personSurname = personSurname;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public Person(Long personId, Integer phoneNumber) {
        this.personId = personId;
        this.phoneNumber = phoneNumber;
    }

    public Person(Long personId, String personName, String personSurname,
                  Integer phoneNumber) {
        this.personId = personId;
        this.personName = personName;
        this.personSurname = personSurname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(personId, person.personId)) return false;
        if (!Objects.equals(personName, person.personName)) return false;
        if (!Objects.equals(personSurname, person.personSurname))
            return false;
        if (!Objects.equals(phoneNumber, person.phoneNumber))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        result = 31 * result + (personSurname != null ? personSurname.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + personId +
                ", PersonName='" + personName + '\'' +
                ", PersonSurname='" + personSurname + '\'' +
                ", PhoneNumber=" + phoneNumber +
                '}';
    }
}
