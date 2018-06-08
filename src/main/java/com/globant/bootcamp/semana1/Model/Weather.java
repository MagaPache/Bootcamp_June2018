/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana1.Model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Weather {
    
    private String title;
    private float latitude;
    private float longitude;
    private Location location;
    private Wind wind;
    private Atmosphere atmosphere;
    private Astronomy astronomy;
    private Condition condition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Astronomy getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Weather() {
    }

    public Weather(String title, float latitude, float longitude, Location location, Wind wind, Atmosphere atmosphere, Astronomy astronomy, Condition condition) {
        this.title = title;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.wind = wind;
        this.atmosphere = atmosphere;
        this.astronomy = astronomy;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Weather{" + "title=" + title + ", latitude=" + latitude + ", longitude=" + longitude + ", location=" + location + ", wind=" + wind + ", atmosphere=" + atmosphere + ", astronomy=" + astronomy + ", condition=" + condition + '}';
    }
    
    
    
    
}
