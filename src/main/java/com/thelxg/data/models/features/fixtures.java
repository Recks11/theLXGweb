package com.thelxg.data.models.features;


import javax.persistence.*;


@Entity
public class fixtures {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="fixtureGroup")
    private String group;

    private String homePlayer;

    private String awayPlayer;

    private String homeTeam;

    private String awayTeam;

    private int homeScore;

    private int awayScore;

    private String mailSent;

    private String fixtureTime;

    public fixtures(){}

    public fixtures(String group, String homePlayer, String awayPlayer, String homeTeam, String awayTeam, int homeScore, int awayScore, String mailSent, String time) {
        this.group = group;
        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.mailSent = mailSent;
        this.fixtureTime = time;
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

    public String getHomePlayer() {
        return homePlayer;
    }

    public void setHomePlayer(String homePlayer) {
        this.homePlayer = homePlayer;
    }

    public String getAwayPlayer() {
        return awayPlayer;
    }

    public void setAwayPlayer(String awayPlayer) {
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

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public String getMailSent() {
        return mailSent;
    }

    public void setMailSent(String mailSent) {
        this.mailSent = mailSent;
    }

    public String getTime() {
        return fixtureTime;
    }

    public void setTime(String time) {
        this.fixtureTime = time;
    }

    @Override
    public String toString() {
        return "fixtures{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", homePlayer='" + homePlayer + '\'' +
                ", awayPlayer='" + awayPlayer + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", mailSent='" + mailSent + '\'' +
                ", time='" + fixtureTime + '\'' +
                '}';
    }

    public String viewScore() {
        return "("+ homePlayer +") "+ homeTeam +" " +homeScore+ " : " +awayScore+ " "+awayTeam+" ("+ awayPlayer +")" ;
    }

}
