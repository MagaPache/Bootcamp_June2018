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
    
    private Timestamp sunrise;
    private Timestamp sunset;

    public Timestamp getSunrise() {
        return sunrise;
    }

    public void setSunrise(Timestamp sunrise) {
        this.sunrise = sunrise;
    }

    public Timestamp getSunset() {
        return sunset;
    }

    public void setSunset(Timestamp sunset) {
        this.sunset = sunset;
    }

    public Astronomy() {
    }

    public Astronomy(Timestamp sunrise, Timestamp sunset) {
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Astronomy{" + "sunrise=" + sunrise + ", sunset=" + sunset + '}';
    }
    
    
}
