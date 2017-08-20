package com.thelxg.data.models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rex on 27/05/2017.
 */
@Entity
public class player {

    @Id
    @GeneratedValue
    private Long id;

    private String PlayerId;

    private String firstName;

    private String lastName;

    @Transient
    private String fullName;

    private String alias;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String email;

    private String phoneNumber;

    private String twitterHandle;

    private String instagramHandle;

    private String teamSelected;

    private String teamCountry;

    private String location;

    private String reference;

    private int playerGroup;

    private String mailStatus;

    private boolean fixtureGenerated;

    private boolean inTables;

    @Transient
    private MultipartFile image;

    public player(){}

    public player(String playerId, String firstName, String lastName,
                  String fullName, String alias, Date date, String email,
                  String phoneNumber, String twitterHandle, String instagramHandle,
                  String teamSelected, String teamCountry, String location, String reference,
                  int playerGroup, String mailStatus, boolean fixtureGenerated, boolean inTables, MultipartFile image) {
        PlayerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.alias = alias;
        this.date = date;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.twitterHandle = twitterHandle;
        this.instagramHandle = instagramHandle;
        this.teamSelected = teamSelected;
        this.teamCountry = teamCountry;
        this.location = location;
        this.reference = reference;
        this.playerGroup = playerGroup;
        this.mailStatus = mailStatus;
        this.fixtureGenerated = fixtureGenerated;
        this.inTables = inTables;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(String playerId) {
        PlayerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return getFirstName() +" "+ getLastName();
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    public String getInstagramHandle() {
        return instagramHandle;
    }

    public void setInstagramHandle(String instagramHandle) {
        this.instagramHandle = instagramHandle;
    }

    public String getTeamSelected() {
        return teamSelected;
    }

    public void setTeamSelected(String teamSelected) {
        this.teamSelected = teamSelected;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getPlayerGroup() {
        return playerGroup;
    }

    public void setPlayerGroup(int playerGroup) {
        this.playerGroup = playerGroup;
    }

    public String getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(String mailStatus) {
        this.mailStatus = mailStatus;
    }

    public boolean isFixtureGenerated() {
        return fixtureGenerated;
    }

    public void setFixtureGenerated(boolean fixtureGenerated) {
        this.fixtureGenerated = fixtureGenerated;
    }

    public boolean isInTables() {
        return inTables;
    }

    public void setInTables(boolean inTables) {
        this.inTables = inTables;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "player{" +
                "id=" + id +
                ", PlayerId='" + PlayerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", alias='" + alias + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", twitterHandle='" + twitterHandle + '\'' +
                ", instagramHandle='" + instagramHandle + '\'' +
                ", teamSelected='" + teamSelected + '\'' +
                ", teamCountry='" + teamCountry + '\'' +
                ", location='" + location + '\'' +
                ", reference='" + reference + '\'' +
                ", playerGroup=" + playerGroup +
                ", mailStatus='" + mailStatus + '\'' +
                ", fixtureGenerated='" + fixtureGenerated + '\'' +
                ", inTables=" + inTables +
                ", image=" + image +
                '}';
    }
}
