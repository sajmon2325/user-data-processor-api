package com.opensourcedev.userdataprocessorapi.model;

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


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "LocationInformation{" +
                "streetName='" + streetName + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
