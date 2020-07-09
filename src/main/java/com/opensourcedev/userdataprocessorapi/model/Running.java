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
public class Running {

    Long distance;
    Long kcalBurned;
    Long tempo;
    LocalTime startTime;
    LocalTime endTime;


}
