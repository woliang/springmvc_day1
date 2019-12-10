package com.baizhi.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class User implements Serializable {

    private String username;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @Autowired
    private Address address;

    public User() {
    }

    public User(String username, String password, Date birthday, Address address) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
