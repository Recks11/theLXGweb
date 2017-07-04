package com.thelxg.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rex on 29/06/2017.
 */
@Entity
public class pin {

    @Id
    @GeneratedValue
    public long id;

    public String user;

    public String number;

    public pin() {
    }

    public pin(String user, String number) {
        this.user = user;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "pin{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
