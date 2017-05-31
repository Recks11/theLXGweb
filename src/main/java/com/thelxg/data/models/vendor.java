package com.thelxg.data.models;

//import com.thelxg.data.models.components.Address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by rex on 27/05/2017.
 */
@Entity
public class vendor {

    @Id
    @GeneratedValue
    private long id;

    private String businessName;

    private String email;

    private String phoneNumber;

    private String description;

//  private Address address;

    private String standLocation;

    public vendor(){}

    public vendor(String businessName, String email, String phoneNumber, String description, String standLocation) {
        this.businessName = businessName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.standLocation = standLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public String getStandLocation() {
        return standLocation;
    }

    public void setStandLocation(String standLocation) {
        this.standLocation = standLocation;
    }

    @Override
    public String toString() {
        return "vendor{" +
                "id=" + id +
                ", businessName='" + businessName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", description='" + description + '\'' +
                ", standLocation='" + standLocation + '\'' +
                '}';
    }
}
