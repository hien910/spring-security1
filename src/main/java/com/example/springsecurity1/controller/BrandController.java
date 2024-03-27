package com.example.springsecurity1.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @RolesAllowed({"ADMIN","SALE"})
    @GetMapping
    public String getBrand() {
        return "Get brand";
    }
    @RolesAllowed({"ADMIN","SALE"})
    @PostMapping("/create")
    public String CreateBrand() {
        return "Create brand";
    }

    @RolesAllowed({"ADMIN","SALE"})
    @PutMapping("/update/{id}")
    public String updateBrand(@PathVariable Integer id) {
        return "Update brand " + id;
    }

    @RolesAllowed({"ADMIN","SALE"})
    @DeleteMapping("/{id}")
    public String delateBrand(@PathVariable Integer id) {
        return "Delete brand " + id;
    }
}

