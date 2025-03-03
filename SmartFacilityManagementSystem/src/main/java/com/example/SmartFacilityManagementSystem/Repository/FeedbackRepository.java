package com.example.SmartFacilityManagementSystem.Repository;

import com.example.SmartFacilityManagementSystem.Model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    // Custom queries for feedback can be added as needed
}
