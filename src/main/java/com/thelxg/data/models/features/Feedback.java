package com.thelxg.data.models.features;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Feedback {

    @Id
    @GeneratedValue
    private long id;

    private String email;

    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Feedback() {
    }

    public Feedback(String email, String message, Date date) {
        this.email = email;
        this.message = message;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "feedback{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
