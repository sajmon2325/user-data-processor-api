package com.opensourcedev.userdataprocessorapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalTime;


@Getter
@Setter
@Builder
@ToString
public class Workout{

    Long kcalBurned;
    int numberOfBreaks;
    Long durationOfBreaks;
    LocalTime startTime;
    LocalTime endTime;




}
