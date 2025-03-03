package com.example.SmartFacilityManagementSystem.controller;

import com.example.SmartFacilityManagementSystem.Model.Users;
import com.example.SmartFacilityManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Sign up new user
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody Users user) {
        Users savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    // Login endpoint (for simplicity; use proper authentication mechanisms in production)
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Users user) {
        return userRepository.validateUser(user.getEmail(), user.getPassword())
                .map(validUser -> ResponseEntity.ok((Object) validUser))
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials"));
    }



    // Additional endpoints (update, delete, view details) can be added here
}
