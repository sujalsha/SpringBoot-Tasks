package com.financemanagement.PFMS.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("password")
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date joinedDateTime = new Date();

    public Users() {
    }

    public Users(Long id, String name, String userName, String password, Date joinedDateTime) {
        Id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.joinedDateTime = joinedDateTime;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getJoinedDateTime() {
        return joinedDateTime;
    }

    public void setJoinedDateTime(Date joinedDateTime) {
        this.joinedDateTime = joinedDateTime;
    }
}
