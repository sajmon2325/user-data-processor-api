package com.opensourcedev.userdataprocessorapi.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class LocationInformation {

    String streetName;
    String buildingName;
    Long zipCode;
    // TODO implement geospatial data later


    public LocationInformation(String streetName, String buildingName, Long zipCode) {
        this.streetName = streetName;
        this.buildingName = buildingName;
        this.zipCode = zipCode;
    }


}
