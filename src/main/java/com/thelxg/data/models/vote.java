package com.thelxg.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class vote {

    @Id
    @GeneratedValue
    private long id;

    private String playerAlias;

    private int numberOfVotes;

    public vote() {
    }

    public vote(String playerAlias, int numberOfVotes) {
        this.playerAlias = playerAlias;
        this.numberOfVotes = numberOfVotes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerAlias() {
        return playerAlias;
    }

    public void setPlayerAlias(String playerAlias) {
        this.playerAlias = playerAlias;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    @Override
    public String toString() {
        return "vote{" +
                "id=" + id +
                ", playerAlias='" + playerAlias + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
