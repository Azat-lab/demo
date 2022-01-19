package com.example.HAndbook.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "handbook")
public class Handbook {
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

    public Handbook() {
    }

    public Handbook(Long personId, Integer phoneNumber) {
        this.PersonId = personId;
        this.PhoneNumber = phoneNumber;
    }

    public Handbook(Long personId, String personName, String personSurname,
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

        Handbook handbook = (Handbook) o;

        if (PersonId != null ? !PersonId.equals(handbook.PersonId) : handbook.PersonId != null) return false;
        if (PersonName != null ? !PersonName.equals(handbook.PersonName) : handbook.PersonName != null) return false;
        if (PersonSurname != null ? !PersonSurname.equals(handbook.PersonSurname) : handbook.PersonSurname != null)
            return false;
        if (PhoneNumber != null ? !PhoneNumber.equals(handbook.PhoneNumber) : handbook.PhoneNumber != null)
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
        return "Handbook{" +
                "PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                ", PersonSurname='" + PersonSurname + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
