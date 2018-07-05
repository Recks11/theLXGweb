package com.thelxg.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rex on 01/06/2017.
 */
@Entity
public class teams {

    @Id
    @GeneratedValue
    private long id;

    private String teamName;

    private String teamCountry;

    private String region;

    public teams() {
    }

    public teams(String teamName, String teamCountry, String region) {
        this.teamName = teamName;
        this.teamCountry = teamCountry;
        this.region = region;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "teams{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", teamCountry='" + teamCountry + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
