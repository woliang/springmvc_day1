package com.baizhi.entity;

import java.io.Serializable;

public class Address implements Serializable {

    private String seat;
    private String zip;

    public Address() {
    }

    public Address(String seat, String zip) {
        this.seat = seat;
        this.zip = zip;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "seat='" + seat + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
