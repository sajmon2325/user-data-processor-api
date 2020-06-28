package com.opensourcedev.userdataprocessorapi.model;

import java.time.LocalTime;

public class Running extends Sport {

    Long distance;
    Long kcalBurned;
    Long tempo;

    public Running(LocalTime startTime, LocalTime endTime, Long distance, Long kcalBurned, Long tempo) {
        super(startTime, endTime);
        this.distance = distance;
        this.kcalBurned = kcalBurned;
        this.tempo = tempo;
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

    public Long getTempo() {
        return tempo;
    }

    public void setTempo(Long tempo) {
        this.tempo = tempo;
    }


    @Override
    public String toString() {
        return "Running{" +
                "distance=" + distance +
                ", kcalBurned=" + kcalBurned +
                ", tempo=" + tempo +
                '}';
    }
}
