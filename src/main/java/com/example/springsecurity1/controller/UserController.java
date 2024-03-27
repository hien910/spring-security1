package com.example.springsecurity1.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @RolesAllowed("USER")
    @GetMapping("/profile")
    public String userProfile() {
        // Logic to retrieve and display user's profile
        return "profile user";
    }

    @RolesAllowed("USER")
    @PutMapping("profile/update")
    public String updateUserProfile() {
        // Logic to update user's profile
        return "profile update";
    }

}
