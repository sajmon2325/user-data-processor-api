package com.opensourcedev.userdataprocessorapi.model;

import com.opensourcedev.userdataprocessorapi.enums.SportType;

public class User {

    String id;
    String username;
    String name;
    String surname;
    int age;
    Long height;
    Long weight;
    SportType sportType;
    Sport sport;
    LocationInformation locationInformation;


    public User(String id, String username, String name, String surname, int age, Long height, Long weight,
                SportType sportType, Sport sport, LocationInformation locationInformation) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sportType = sportType;
        this.sport = sport;
        this.locationInformation = locationInformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sportType=" + sportType +
                '}';
    }

}
