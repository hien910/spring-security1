package com.example.springsecurity1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @PreAuthorize("hasAnyRole('SALE','ADMIN')")
    @GetMapping("/dashboard")
    public String getDashboard(){
        return "dashboard";
    }
}