package com.opensourcedev.userdataprocessorapi.model;

import java.time.LocalTime;

public class Cycling extends Sport {

    Long distance;
    Long kcalBurned;
    Long speed;


    public Cycling(LocalTime startTime, LocalTime endTime, Long distance, Long kcalBurned, Long speed) {
        super(startTime, endTime);
        this.distance = distance;
        this.kcalBurned = kcalBurned;
        this.speed = speed;
    }


    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getKcalBurned() {
        return kcalBurned;
    }

    public void setKcalBurned(Long kcalBurned) {
        this.kcalBurned = kcalBurned;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Cycling{" +
                "distance=" + distance +
                ", kcalBurned=" + kcalBurned +
                ", speed=" + speed +
                '}';
    }
}
