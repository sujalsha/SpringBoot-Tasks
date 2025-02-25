package com.gymmembership.gymmembership.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GymMembers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;


    @JsonProperty("name")
    private String name;

    @JsonProperty("membership")
    private String membership;

    @JsonProperty("activeStatus")
    private String activeStatus;

    @JsonProperty("workoutPlan")
    private String workoutPlan;

    public GymMembers(Long memberId, String name, String membership, String activeStatus, String workoutPlan) {
        this.memberId = memberId;
        this.name = name;
        this.membership = membership;
        this.activeStatus = activeStatus;
        this.workoutPlan = workoutPlan;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(String workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public GymMembers() {
    }
}
