package com.thelxg.data.models.features;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name = "playerGroups")
public class groups {

    @Id
    @GeneratedValue
    private long id;

    private int groupNumber;

    public groups() {
    }

    public groups(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "groups{" +
                "id=" + id +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
