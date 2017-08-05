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

    private boolean tableGenerated;

    private boolean duplicated;

    private boolean fixtureUpdated;

    public fixtures(){}

    public fixtures(String group, String homePlayer, String awayPlayer,
                    String homeTeam, String awayTeam, int homeScore,
                    int awayScore, String mailSent, String fixtureTime,
                    boolean tableGenerated,boolean duplicated, boolean fixtureUpdated) {
        this.group = group;
        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.mailSent = mailSent;
        this.fixtureTime = fixtureTime;
        this.tableGenerated = tableGenerated;
        this.duplicated = duplicated;
        this.fixtureUpdated = fixtureUpdated;
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

    public String getFixtureTime() {
        return fixtureTime;
    }

    public void setFixtureTime(String fixtureTime) {
        this.fixtureTime = fixtureTime;
    }

    public boolean isTableGenerated() {
        return tableGenerated;
    }

    public void setTableGenerated(boolean tableGenerated) {
        this.tableGenerated = tableGenerated;
    }

    public boolean isDuplicated() {
        return duplicated;
    }

    public void setDuplicated(boolean duplicated) {
        this.duplicated = duplicated;
    }

    public boolean isFixtureUpdated() {
        return fixtureUpdated;
    }

    public void setFixtureUpdated(boolean fixtureUpdated) {
        this.fixtureUpdated = fixtureUpdated;
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

    public String viewFixture() {
        return fixtureTime+" "+"("+ homePlayer +") "+ homeTeam +" : "+awayTeam+" ("+ awayPlayer +")\n" ;
    }

    public String viewScore() {
        return fixtureTime+" "+"("+ homePlayer +") "+ homeTeam +" " +homeScore+ " : " +awayScore+ " "+awayTeam+" ("+ awayPlayer +")\n" ;
    }

}
