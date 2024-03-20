package com.example.springsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @GetMapping
    public String getBlog() {
        return "Get blog";
    }

    @PostMapping("/create")
    public String CreateBlog() {
        return "Create blog";
    }

    @PutMapping("/update/{id}")
    public String updateBlog(@PathVariable Integer id) {
        return "Update blog " + id;
    }

    @DeleteMapping("/{id}")
    public String delateBlog(@PathVariable Integer id) {
        return "Delete blog " + id;
    }
}
