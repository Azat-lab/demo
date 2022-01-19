package com.example.HAndbook.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "handbook")
public class Handbook {
    @Id
    @Column(name = "person_id")
    private int PersonId;

    @Column(name = "person_name")
    private String PersonName;

    @Column(name = "person_surname")
    private String PersonSurname;

    @Column(name = "phone_number")
    private int PhoneNumber;


    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Handbook() {
    }

    public Handbook(int personId, int phoneNumber) {
        this.PersonId = personId;
        this.PhoneNumber = phoneNumber;
    }

    public Handbook(int personId, String personName, String personSurname,
                    int phoneNumber) {
        this.PersonId = personId;
        this.PersonName = personName;
        this.PersonSurname = personSurname;
        this.PhoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
       Handbook handbook = (Handbook) obj;
        return Objects.equals(PersonId, handbook.PersonId) &&
                Objects.equals(PersonName, handbook.PersonName) &&
                Objects.equals(PersonName, handbook.PersonSurname) &&
                Objects.equals(PhoneNumber, handbook.PhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PersonId, PersonName, PersonSurname, PhoneNumber);
    }

    @Override
    public String toString() {
        return "Handbook{" +
                "PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                ", PersonSurname='" + PersonSurname + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
