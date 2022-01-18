package com.example.HAndbook.demo.impl;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "operator_id")
public class OperatorId {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "telekom_operator")
    private String telekomOperator;

    @Column(name = "operator_name")
    private String operatorName;

    @Column(name = "operator_code")
    private int operatorCode;

    @Column(name = "operator_country")
    private String operatorCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelekomOperator() {
        return telekomOperator;
    }

    public void setTelekomOperator(String telekomOperator) {
        this.telekomOperator = telekomOperator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
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
                      String operatorName, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorName = operatorName;
        this.operatorCountry = operatorCountry;
    }

    public OperatorId(String telekomOperator, int operatorCode,
                      String operatorName, String operatorCountry) {
        this.telekomOperator = telekomOperator;
        this.operatorCode = operatorCode;
        this.operatorName = operatorName;
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
                Objects.equals(operatorName, operatorId.operatorName) &&
                Objects.equals(operatorCountry, operatorId.operatorCountry);
    }

    @Override
    public String toString() {
        return "Operator_Id{" +
                "telekomOperator='" + telekomOperator + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", operatorCode=" + operatorCode +
                ", operatorCountry='" + operatorCountry + '\'' +
                '}';
    }

    @Entity
    @Table(name = "handbook")
    public class Handbook {

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
        @Entity
        @Table(name = "country")
        public class Country {


            private static Object countryName;
            private static Object address;
            private static Object countryAreaCodeId;
            @Id
            @Column(name = "country_area_code_id")
            private long CountryAreaCodeId;

            @Column(name = "country_name")
            private String CountryName;

            @Column(name = "address")
            private String Address;

            public Country() {

            }

            public String getCountryName() {
                return CountryName;
            }

            public void setCountryName(String countryName) {
                this.CountryName = countryName;
            }

            public long getCountryAreaCodeId() {
                return CountryAreaCodeId;
            }

            public void setСountryAreaCodeId(long countryAreaCodeId) {
                this.CountryAreaCodeId = countryAreaCodeId;
            }

            public String getAddress() {
                return Address;
            }

            public void setAddress(String address) {
                this.Address = address;
            }

            public void Country() {
            }

            public Country(String countryName, String address) {
                this.CountryName = countryName;
                this.Address = address;
            }

            public Country(String countryName, Long countryAreaCodeId, String address) {
                this.CountryName = countryName;
                this.CountryAreaCodeId = countryAreaCodeId;
                this.Address = address;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                return Objects.equals(CountryName, Country.countryName) &&
                        Objects.equals(CountryAreaCodeId, Country.countryAreaCodeId) &&
                        Objects.equals(Address, Country.address);
            }

            @Override
            public int hashCode() {
                return Objects.hash(CountryName, CountryAreaCodeId, Address);
            }

            @Override
            public String toString() {
                return "HandbookImpl{" +
                        "countryName='" + CountryName + '\'' +
                        ", id=" + CountryAreaCodeId +
                        ", address='" + Address + '\'' +
                        '}';
            }
        }
    }
}
