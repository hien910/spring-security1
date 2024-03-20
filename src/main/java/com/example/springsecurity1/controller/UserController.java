package com.example.springsecurity1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public String userProfile() {
        // Logic to retrieve and display user's profile
        return "profile user";
    }

    @PutMapping("profile/update")
    public String updateUserProfile() {
        // Logic to update user's profile
        return "profile update";
    }

}
