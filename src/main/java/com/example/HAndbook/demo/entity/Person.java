package com.example.HAndbook.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long PersonId;

    @Column(name = "person_name")
    private String PersonName;

    @Column(name = "person_surname")
    private String PersonSurname;

    @Column(name = "phone_number")
    private Integer PhoneNumber;

    public Long getPersonId() {
        return PersonId;
    }

    public void setPersonId(Long personId) {
        PersonId = personId;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getPersonSurname() {
        return PersonSurname;
    }

    public void setPersonSurname(String personSurname) {
        PersonSurname = personSurname;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Person() {
    }

    public Person(Long personId, Integer phoneNumber) {
        this.PersonId = personId;
        this.PhoneNumber = phoneNumber;
    }

    public Person(Long personId, String personName, String personSurname,
                  Integer phoneNumber) {
        this.PersonId = personId;
        this.PersonName = personName;
        this.PersonSurname = personSurname;
        this.PhoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(PersonId, person.PersonId)) return false;
        if (!Objects.equals(PersonName, person.PersonName)) return false;
        if (!Objects.equals(PersonSurname, person.PersonSurname))
            return false;
        if (!Objects.equals(PhoneNumber, person.PhoneNumber))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = PersonId != null ? PersonId.hashCode() : 0;
        result = 31 * result + (PersonName != null ? PersonName.hashCode() : 0);
        result = 31 * result + (PersonSurname != null ? PersonSurname.hashCode() : 0);
        result = 31 * result + (PhoneNumber != null ? PhoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                ", PersonSurname='" + PersonSurname + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
