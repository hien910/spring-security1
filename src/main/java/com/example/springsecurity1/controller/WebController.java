package com.example.springsecurity1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/") // ai cũng có thể truy cập
    public String getHome() {
        return "Home Page";
    }

    @GetMapping("/sale")
    public String getSale() {
        return "Sale Page";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin Page";
    }

    @GetMapping("/author")
    public String getAuthor() {
        return "Author Page";
    }

    @GetMapping("/user")
    public String getUser() {
        return "User Page";
    }
    @GetMapping("/dashboard")
    public String getDashboard() {
        return "Dashboard Page";
    }
    @GetMapping("/info")
    public ResponseEntity<?> getInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return ResponseEntity.ok(authentication);
    }

}
