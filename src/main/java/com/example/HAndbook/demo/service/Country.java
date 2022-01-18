package com.example.HAndbook.demo.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Country")
public class Country {

    @Id
    private String countryName;
    private Long country_area_code_id;
    private String address;

    public Country(String cityName,
                   long country_area_code_id,
                   String adress) {
        this.countryName = countryName;
        this.country_area_code_id = country_area_code_id;
        this.address = address;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getCountry_area_code_id() {
        return country_area_code_id;
    }

    public void setCCountry_area_code_id(long country_area_code_id) {
        this.country_area_code_id = country_area_code_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

