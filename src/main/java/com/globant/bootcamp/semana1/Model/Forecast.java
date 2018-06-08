/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.semana1.Model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Forecast {
    
    private int code;
    private Date date;
    private String day;
    private int high;
    private int low;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public Forecast() {
    }

    public Forecast(int code, Date date, String day, int high, int low, String weatherDescription) {
        this.code = code;
        this.date = date;
        this.day = day;
        this.high = high;
        this.low = low;
        this.weatherDescription = weatherDescription;
    }

    @Override
    public String toString() {
        return "Forecast{" + "code=" + code + ", date=" + date + ", day=" + day + ", high=" + high + ", low=" + low + ", weatherDescription=" + weatherDescription + '}';
    }
    
    
    
}
