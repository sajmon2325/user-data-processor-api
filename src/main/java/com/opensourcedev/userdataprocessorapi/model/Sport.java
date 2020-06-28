package com.opensourcedev.userdataprocessorapi.model;

import java.time.LocalTime;

public class Sport {


    LocalTime startTime;
    LocalTime endTime;



    public Sport(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }


    @Override
    public String toString() {
        return "Sport{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
