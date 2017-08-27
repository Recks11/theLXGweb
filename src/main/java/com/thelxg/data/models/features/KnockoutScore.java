package com.thelxg.data.models.features;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KnockoutScore {

    @Id
    @GeneratedValue
    private long id;

    private int homeScore;

    private int awayScore;

    private int roundNumber;

    private int scoreHeirachy;

    public KnockoutScore() {
    }

    public KnockoutScore(int homeScore, int awayScore, int roundNumber, int scoreHeirachy) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.roundNumber = roundNumber;
        this.scoreHeirachy = scoreHeirachy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getScoreHeirachy() {
        return scoreHeirachy;
    }

    public void setScoreHeirachy(int scoreHeirachy) {
        this.scoreHeirachy = scoreHeirachy;
    }

    @Override
    public String toString() {
        return "KnockoutScore{" +
                "id=" + id +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", roundNumber=" + roundNumber +
                ", scoreHeirachy=" + scoreHeirachy +
                '}';
    }

    public String scoreApi() {
        return "["+homeScore+','+awayScore+"]";
    }
}
