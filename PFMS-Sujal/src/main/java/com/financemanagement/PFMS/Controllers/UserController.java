package com.financemanagement.PFMS.Controllers;

import com.financemanagement.PFMS.Models.Users;
import com.financemanagement.PFMS.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> userSignUp(@RequestBody Users users){
        Users usersObj = userRepository.save(users);
        Map<String, String> response = new HashMap<>();
        if (usersObj.getId() != 0){
            response.put("Status", "User Added Successfully");
        }
        else {
            response.put("Status", "User Addition Failed");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("/signin")
    public ResponseEntity<Map<String, String>> userSignIn(@RequestBody Users users){
        List<Users> usersObj = userRepository.userSignIn(users.getUserName(),users.getPassword());
        Map<String, String> response = new HashMap<>();
        if (!usersObj.isEmpty()){
            response.put("Status", "User SignIn Successful");
            response.put("userId", String.valueOf(usersObj.get(0).getId()));
            response.put("name", String.valueOf(usersObj.get(0).getName()));
        }
        else {
            response.put("Status", "User SignIn Failed");
        }
        return ResponseEntity.ok(response);
    }
}
