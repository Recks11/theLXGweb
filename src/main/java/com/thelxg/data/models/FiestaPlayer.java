package com.thelxg.data.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FiestaPlayer {

    @Id
    @GeneratedValue
    private Long id;

    private String PlayerId;

    private String firstName;

    private String lastName;

    private String alias;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String email;

    private String phoneNumber;

    private String twitterHandle;

    private String instagramHandle;

    private String mailStatus;

    private String reference;

    public FiestaPlayer() {
    }

    public FiestaPlayer(String playerId, String firstName, String lastName, String alias, Date date, String email, String phoneNumber, String twitterHandle, String instagramHandle, String mailStatus, String reference) {
        PlayerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.alias = alias;
        this.date = date;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.twitterHandle = twitterHandle;
        this.instagramHandle = instagramHandle;
        this.mailStatus = mailStatus;
        this.reference = reference;
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

    public String getMailStatus() {
        return mailStatus;
    }

    public void setMailStatus(String mailStatus) {
        this.mailStatus = mailStatus;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "FiestaPlayer{" +
                "id=" + id +
                ", PlayerId='" + PlayerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alias='" + alias + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", twitterHandle='" + twitterHandle + '\'' +
                ", instagramHandle='" + instagramHandle + '\'' +
                ", mailStatus='" + mailStatus + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
