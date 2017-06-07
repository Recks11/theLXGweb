package com.thelxg.data.models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

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

    private String alias;

    private String email;

    private String phoneNumber;

    private String twitterHandle;

    private String instagramHandle;

    private String teamSelected;

    private String teamCountry;

    private String location;

    @Transient
    private MultipartFile image;

    public player(){}

    public player(String playerId, String firstName, String lastName, String alias, String email, String phoneNumber, String twitterHandle, String instagramHandle, String teamSelected, String teamCountry, String location, MultipartFile image) {
        PlayerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.twitterHandle = twitterHandle;
        this.instagramHandle = instagramHandle;
        this.teamSelected = teamSelected;
        this.teamCountry = teamCountry;
        this.location = location;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public String getLocation() {
        return location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public void setLocation(String location) {
        this.location = location;
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
                ", alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", twitterHandle='" + twitterHandle + '\'' +
                ", instagramHandle='" + instagramHandle + '\'' +
                ", teamSelected='" + teamSelected + '\'' +
                ", teamCountry='" + teamCountry + '\'' +
                ", location='" + location + '\'' +
                ", image=" + image +
                '}';
    }
}
