package com.example.SmartFacilityManagementSystem.Repository;

import com.example.SmartFacilityManagementSystem.Model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
    // Additional custom queries can be defined here
}
