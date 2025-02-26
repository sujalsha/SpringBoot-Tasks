package com.contactapp.OCMS.Controllers;

import com.contactapp.OCMS.Models.Users;
import com.contactapp.OCMS.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public ResponseEntity<Map<String, String>> addUser(@RequestBody Users users){
        Users usersObj = userRepository.save(users);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Success");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/view-all-users")
    public ResponseEntity<List<Users>> viewAllUsers(){
        List<Users> vehicles = userRepository.findAll();
        return ResponseEntity.ok(vehicles);
    }

    @DeleteMapping("/delete-user")
    public ResponseEntity<Map<String, String>> deleteUser(@RequestBody Users users){
        userRepository.deleteUser(users.getEmail());
        Map<String , String > response=new HashMap<>();
        response.put("Status","Success");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/update-user")
    public ResponseEntity<Map<String, String>> updateVehicle(@RequestBody Users users){
        userRepository.updateUser(users.getPhoneNumber(), users.getName(), users.getEmail());
        Map<String , String > response=new HashMap<>();
        response.put("Status","Success");
        return ResponseEntity.ok(response);
    }
}
