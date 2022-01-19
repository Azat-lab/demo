package com.example.HAndbook.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

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
        return "Country{" +
                "CountryAreaCodeId=" + CountryAreaCodeId +
                ", CountryName='" + CountryName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
