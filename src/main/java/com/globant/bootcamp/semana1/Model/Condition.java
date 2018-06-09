/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana1.Model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Usuario
 */
class Condition {
    
    private int code;
    private Date date;
    private int temperature;
    private String weatherDescription;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Condition() {
    }

    public Condition(int code, Date date, int temperature, String weatherDescription) {
        this.code = code;
        this.date = date;
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
    }

    @Override
    public String toString() {
        return "Condition{" + "code=" + code + ", date=" + date + ", temperature=" + temperature + ", weatherDescription=" + weatherDescription + '}';
    }
    
    
    
}
