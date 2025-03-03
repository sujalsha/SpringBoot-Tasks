package com.example.SmartFacilityManagementSystem.controller;

import com.example.SmartFacilityManagementSystem.Model.Facility;
import com.example.SmartFacilityManagementSystem.Repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facilities")
public class FacilityController {

    @Autowired
    private FacilityRepository facilityRepository;

    // List all facilities
    @GetMapping
    public ResponseEntity<List<Facility>> getAllFacilities() {
        return ResponseEntity.ok(facilityRepository.findAll());
    }

    // Add a new facility (admin only)
    @PostMapping
    public ResponseEntity<Facility> addFacility(@RequestBody Facility facility) {
        Facility savedFacility = facilityRepository.save(facility);
        return ResponseEntity.ok(savedFacility);
    }

    // Update facility status or details
    @PutMapping("/{id}")
    public ResponseEntity<Facility> updateFacility(@PathVariable int id, @RequestBody Facility facility) {
        facility.setFacilityId(id);
        Facility updatedFacility = facilityRepository.save(facility);
        return ResponseEntity.ok(updatedFacility);
    }

    // Delete facility (admin only)
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFacility(@PathVariable int id) {
        facilityRepository.deleteById(id);
        return ResponseEntity.ok("Facility deleted successfully");
    }
}
