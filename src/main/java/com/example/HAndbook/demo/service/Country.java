package com.example.HAndbook.demo.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Country")
public class Country {

    @Id
    private String cityName;
    private int city_area_code;
    private String adress;

    public Country(String cityName,
                   int city_area_code,
                   String adress) {
        this.cityName = cityName;
        this.city_area_code = city_area_code;
        this.adress = adress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCity_area_code() {
        return city_area_code;
    }

    public void setCity_area_code(int city_area_code) {
        this.city_area_code = city_area_code;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


}

