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
class Wind {
    
    private int chill;
    private int direction;
    private int speed;

    public int getChill() {
        return chill;
    }

    public void setChill(int chill) {
        this.chill = chill;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Wind() {
    }

    public Wind(int chill, int direction, int speed) {
        this.chill = chill;
        this.direction = direction;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind{" + "chill=" + chill + ", direction=" + direction + ", speed=" + speed + '}';
    }
    
    
    
}
