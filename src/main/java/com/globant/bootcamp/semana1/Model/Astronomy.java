/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana1.Model;

import java.sql.Timestamp;

/**
 *
 * @author Usuario
 */
class Astronomy {
    
    private String sunrise;
    private String sunset;

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Astronomy() {
    }

    public Astronomy(String sunrise, String sunset) {
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Astronomy{" + "sunrise=" + sunrise + ", sunset=" + sunset + '}';
    }
    
    
}
