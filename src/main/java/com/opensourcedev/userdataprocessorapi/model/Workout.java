package com.opensourcedev.userdataprocessorapi.model;

import java.time.LocalTime;

public class Workout extends Sport{

    Long kcalBurned;
    int numberOfBreaks;
    Long durationOfBreaks;


    public Workout(LocalTime startTime, LocalTime endTime, Long kcalBurned, int numberOfBreaks, Long durationOfBreaks) {
        super(startTime, endTime);
        this.kcalBurned = kcalBurned;
        this.numberOfBreaks = numberOfBreaks;
        this.durationOfBreaks = durationOfBreaks;
    }


    public Long getKcalBurned() {
        return kcalBurned;
    }

    public void setKcalBurned(Long kcalBurned) {
        this.kcalBurned = kcalBurned;
    }

    public int getNumberOfBreaks() {
        return numberOfBreaks;
    }

    public void setNumberOfBreaks(int numberOfBreaks) {
        this.numberOfBreaks = numberOfBreaks;
    }

    public Long getDurationOfBreaks() {
        return durationOfBreaks;
    }

    public void setDurationOfBreaks(Long durationOfBreaks) {
        this.durationOfBreaks = durationOfBreaks;
    }


    @Override
    public String toString() {
        return "Workout{" +
                "kcalBurned=" + kcalBurned +
                ", numberOfBreaks=" + numberOfBreaks +
                ", durationOfBreaks=" + durationOfBreaks +
                '}';
    }
}
