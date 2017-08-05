package com.thelxg.data.models.features;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class tables {

    @Id
    @GeneratedValue
    private long id;

    private int played;

    private String playerId;

    private String playerAlias;

    private int wins;

    private int draws;

    private int losses;

    private int goalDifference;

    private int points;

    @Column(name = "tableGroup")
    private int group;

    public tables() {
    }

    public tables(int played, String playerId, String playerAlias, int wins, int draws, int losses, int goalDifference, int points, int group) {
        this.played = played;
        this.playerId = playerId;
        this.playerAlias = playerAlias;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.goalDifference = goalDifference;
        this.points = points;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerAlias() {
        return playerAlias;
    }

    public void setPlayerAlias(String playerAlias) {
        this.playerAlias = playerAlias;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "tables{" +
                "id=" + id +
                ", played=" + played +
                ", playerId='" + playerId + '\'' +
                ", playerAlias='" + playerAlias + '\'' +
                ", wins=" + wins +
                ", draws=" + draws +
                ", losses=" + losses +
                ", goalDifference=" + goalDifference +
                ", points=" + points +
                ", group=" + group +
                '}';
    }
}
