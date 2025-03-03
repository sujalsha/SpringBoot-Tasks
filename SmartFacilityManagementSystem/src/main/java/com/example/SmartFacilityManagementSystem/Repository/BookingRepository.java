package com.example.SmartFacilityManagementSystem.Repository;

import com.example.SmartFacilityManagementSystem.Model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

    // Retrieve bookings for a given user
    @Query("SELECT b FROM Booking b WHERE b.userId = ?1")
    List<Booking> findByUserId(int userId);
}
