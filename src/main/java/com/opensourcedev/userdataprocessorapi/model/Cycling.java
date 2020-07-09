package com.opensourcedev.userdataprocessorapi.model;

import lombok.*;

import java.time.LocalTime;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cycling {

    Long distance;
    Long kcalBurned;
    Long speed;
    LocalTime startTime;
    LocalTime endTime;




}
