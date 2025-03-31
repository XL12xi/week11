package com.example.week11;

public class Player {
    private String name;
    private int age;
    private String country;
    private String position;
    private String team;
    private int shirtNumber;

    public Player(String name, int age, String country, String position, String team, int shirtNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.position = position;
        this.team = team;
        this.shirtNumber = shirtNumber;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }
}
