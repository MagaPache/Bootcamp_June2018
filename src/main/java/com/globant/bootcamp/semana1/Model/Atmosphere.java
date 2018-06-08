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
class Atmosphere {
    
    private int humidity;
    private float pressure;
    private float rising;
    private float visibility;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getRising() {
        return rising;
    }

    public void setRising(float rising) {
        this.rising = rising;
    }

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public Atmosphere() {
    }

    public Atmosphere(int humidity, float pressure, float rising, float visibility) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.rising = rising;
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "Atmosphere{" + "humidity=" + humidity + ", pressure=" + pressure + ", rising=" + rising + ", visibility=" + visibility + '}';
    }
    
    
    
    
}
