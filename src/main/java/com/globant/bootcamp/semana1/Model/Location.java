/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana1.Model;

/**
 *
 * @author Usuario
 */
class Location {
    
    private String cityName;
    private String country;
    private String region;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Location() {
    }

    public Location(String cityName, String country, String region) {
        this.cityName = cityName;
        this.country = country;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Location{" + "cityName=" + cityName + ", country=" + country + ", region=" + region + '}';
    }
    
    
}
