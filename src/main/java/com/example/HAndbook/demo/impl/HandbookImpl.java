package com.example.HAndbook.demo.impl;



import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country")
public class HandbookImpl {

    @Column(name = "country_name")
    private static String countryName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "country_area_code_id")
    private static long id;

    @Column(name = "address")
    private static String address;

    public HandbookImpl() {

    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void HandbookImpl(){
    }

    public HandbookImpl(String countryName, String address){
        HandbookImpl.countryName = countryName;
        HandbookImpl.address = address;
    }
    public HandbookImpl(String countryName, Long id, String address){
        HandbookImpl.countryName = countryName;
        HandbookImpl.id = id;
        HandbookImpl.address = address;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return  true;
        if (o == null||getClass() != o.getClass())
            return  false;
        return Objects.equals(countryName, HandbookImpl.countryName) &&
                Objects.equals(id, HandbookImpl.id) &&
                Objects.equals(address, HandbookImpl.address);
    }
    @Override
    public int hashCode(){
        return Objects.hash(countryName, id, address);
    }

    @Override
    public String toString() {
        return "HandbookImpl{" +
                "countryName='" + countryName + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
    @Entity
    @Table(name = "operator_id")
    public class Operator_Id implements com.example.HAndbook.demo.impl.Operator_Id {

        @Column(name = "telekom_operator")
        private String telekomOperator;

        @Column(name = "operator_name")
        private String operatorName;

        @Column(name = "operator_code")
        private int operatorCode;

        @Column(name = "operator_country")
        private String operatorCountry;

        @Override
        public String getTelekomOperator() {
            return telekomOperator;
        }

        @Override
        public void setTelekomOperator(String telekomOperator) {
            this.telekomOperator = telekomOperator;
        }

        @Override
        public String getOperatorName() {
            return operatorName;
        }

        @Override
        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        @Override
        public int getOperatorCode() {
            return operatorCode;
        }

        @Override
        public void setOperatorCode(int operatorCode) {
            this.operatorCode = operatorCode;
        }

        @Override
        public String getOperatorCountry() {
            return operatorCountry;
        }

        @Override
        public void setOperatorCountry(String operatorCountry) {
            this.operatorCountry = operatorCountry;
        }
        public Operator_Id(){

        }
        public Operator_Id(String telekomOperator,
                           String operatorName, String operatorCountry){
            this.telekomOperator = telekomOperator;
            this.operatorName = operatorName;
            this.operatorCountry = operatorCountry;
        }
        public Operator_Id(String telekomOperator, int operatorCode,
                           String operatorName, String operatorCountry){
            this.telekomOperator = telekomOperator;
            this.operatorCode = operatorCode;
            this.operatorName = operatorName;
            this.operatorCountry = operatorCountry;
        }
        @Override
        public boolean equals(Object ob){
            if(this == ob) return true;
            if(ob == null || getClass() != ob.getClass())
                return false;
            Operator_Id operatorId = (Operator_Id) ob;
            return Objects.equals(telekomOperator, operatorId.telekomOperator) &&
                    Objects.equals(operatorCode, operatorId.operatorCode) &&
                    Objects.equals(operatorName, operatorId.operatorName) &&
                    Objects.equals(operatorCountry, operatorId.operatorCountry);
        }
        @Override
        public int hasCode(){
            return Objects.hash(telekomOperator, operatorCode,
                    operatorName, operatorCountry);
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
        public class Handbook{

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

            public Handbook(int personId, int phoneNumber){
                this.PersonId = personId;
                this.PhoneNumber = phoneNumber;
            }
            public Handbook(int personId, String personName, String personSurname,
                            int phoneNumber){
                this.PersonId = personId;
                this.PersonName = personName;
                this.PersonSurname = personSurname;
                this.PhoneNumber = phoneNumber;
            }

            @Override
            public boolean equals(Object obj){
                if(this == obj)
                    return true;
                if(obj == null || getClass() != obj.getClass())
                    return false;
                Handbook handbook = (Handbook) obj;
                return Objects.equals(PersonId, handbook.PersonId) &&
                        Objects.equals(PersonName, handbook.PersonName) &&
                        Objects.equals(PersonName, handbook.PersonSurname) &&
                        Objects.equals(PhoneNumber, handbook.PhoneNumber);
            }
            @Override
            public int hashCode(){
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
    }
//    private int person_id;
//    private String person_name;
//    private String person_surname;
//    private int phone_number;

}



