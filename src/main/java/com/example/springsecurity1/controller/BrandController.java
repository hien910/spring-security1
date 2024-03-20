package com.example.springsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/brand")
public class BrandController {

    @GetMapping
    public String getBrand() {
        return "Get brand";
    }

    @PostMapping("/create")
    public String CreateBrand() {
        return "Create brand";
    }

    @PutMapping("/update/{id}")
    public String updateBrand(@PathVariable Integer id) {
        return "Update brand " + id;
    }

    @DeleteMapping("/{id}")
    public String delateBrand(@PathVariable Integer id) {
        return "Delete brand " + id;
    }
}

