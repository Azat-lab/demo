package com.example.HAndbook.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_area_code_id")
    private Long CountryAreaCodeId;

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

    public void setСountryAreaCodeId(Long countryAreaCodeId) {
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (CountryAreaCodeId != null ? !CountryAreaCodeId.equals(country.CountryAreaCodeId) : country.CountryAreaCodeId != null)
            return false;
        if (CountryName != null ? !CountryName.equals(country.CountryName) : country.CountryName != null) return false;
        return Address != null ? Address.equals(country.Address) : country.Address == null;
    }

    @Override
    public int hashCode() {
        int result = CountryAreaCodeId != null ? CountryAreaCodeId.hashCode() : 0;
        result = 31 * result + (CountryName != null ? CountryName.hashCode() : 0);
        result = 31 * result + (Address != null ? Address.hashCode() : 0);
        return result;
    }

    //
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        return Objects.equals(CountryName, Country.countryName) &&
//                Objects.equals(CountryAreaCodeId, Country.countryAreaCodeId) &&
//                Objects.equals(Address, Country.address);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(CountryName, CountryAreaCodeId, Address);
//    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryAreaCodeId=" + CountryAreaCodeId +
                ", CountryName='" + CountryName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
