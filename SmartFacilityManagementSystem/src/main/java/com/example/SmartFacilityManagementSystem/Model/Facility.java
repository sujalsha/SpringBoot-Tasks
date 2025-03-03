package com.example.SmartFacilityManagementSystem.Model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Facilities")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityId;

    @Column(name = "facility_name", length = 100)
    private String facilityName;

    @Enumerated(EnumType.STRING)
    @Column(name = "facility_type")
    private FacilityType facilityType; // MEETING_ROOM, EVENT_HALL, RESOURCE

    private int capacity;

    @Enumerated(EnumType.STRING)
    private Status status; // AVAILABLE, MAINTENANCE, BOOKED

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    public enum FacilityType {
        MEETING_ROOM,
        EVENT_HALL,
        RESOURCE
    }

    public enum Status {
        AVAILABLE,
        MAINTENANCE,
        BOOKED
    }

    // Getters and Setters
    public int getFacilityId() { return facilityId; }
    public void setFacilityId(int facilityId) { this.facilityId = facilityId; }

    public String getFacilityName() { return facilityName; }
    public void setFacilityName(String facilityName) { this.facilityName = facilityName; }

    public FacilityType getFacilityType() { return facilityType; }
    public void setFacilityType(FacilityType facilityType) { this.facilityType = facilityType; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}

