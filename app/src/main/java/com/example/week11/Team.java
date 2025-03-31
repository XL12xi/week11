package com.example.week11;
public class Team {
    private String name;
    private String country;
    private String league;
    private String stadium;
    private int founded;

    public Team(String name, String country, String league, String stadium, int founded) {
        this.name = name;
        this.country = country;
        this.league = league;
        this.stadium = stadium;
        this.founded = founded;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getLeague() {
        return league;
    }

    public String getStadium() {
        return stadium;
    }

    public int getFounded() {
        return founded;
    }
}
