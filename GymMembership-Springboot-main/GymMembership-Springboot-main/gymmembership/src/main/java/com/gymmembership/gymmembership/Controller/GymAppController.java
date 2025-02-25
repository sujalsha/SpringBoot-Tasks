package com.gymmembership.gymmembership.Controller;

import com.gymmembership.gymmembership.Models.GymMembers;
import com.gymmembership.gymmembership.Repository.GymMembersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GymAppController {
    @Autowired
    private GymMembersRepository gymMembersRepository;

    @Transactional
    @PostMapping("/gymmemberentry")
    public ResponseEntity<Map<String, String>> gymMemberEntry(@RequestBody GymMembers gymMember){
        GymMembers gymMemberObj = gymMembersRepository.save(gymMember);
        Map<String, String> response = new HashMap<>();
        response.put("Gym member", "Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/viewallproducts")
    public ResponseEntity<List<GymMembers>> gymMembersList() {
        List<GymMembers> gymMembers = gymMembersRepository.findAll();
        return ResponseEntity.ok(gymMembers);
    }
}
