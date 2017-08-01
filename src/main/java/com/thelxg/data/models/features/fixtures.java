package com.thelxg.data.models.features;


import com.thelxg.data.models.player;

import javax.persistence.Transient;

public class fixtures {

    private long id;

    private String group;

    @Transient
    private player homePlayer;

    @Transient
    private player awayPlayer;

    private String homeTeam;

    private String awayTeam;

    private int homeScore;

    private String awayScore;

    public fixtures(){}

    public fixtures(long id, player homePlayer, player awayPlayer, String homeTeam, String awayTeam, int homeScore, String awayScore) {
        this.id = id;
        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public player getHomePlayer() {
        return homePlayer;
    }

    public void setHomePlayer(player homePlayer) {
        this.homePlayer = homePlayer;
    }

    public player getAwayPlayer() {
        return awayPlayer;
    }

    public void setAwayPlayer(player awayPlayer) {
        this.awayPlayer = awayPlayer;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }


    @Override
    public String toString() {
        return "fixtures{" +
                "id=" + id +
                ", homePlayer=" + homePlayer +
                ", awayPlayer=" + awayPlayer +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeScore=" + homeScore +
                ", awayScore='" + awayScore + '\'' +
                '}';
    }

    public String viewScore() {
        return "("+ homePlayer +") "+ homeTeam +" " +homeScore+ " : " +awayScore+ " "+awayTeam+" ("+ awayPlayer +")" ;
    }

}
