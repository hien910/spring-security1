package com.example.springsecurity1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Secured({"ROLE_ADMIN","ROLE_SALE","ROLE_AUTHOR"})
    @GetMapping
    public String getBlog() {
        return "Get blog";
    }

    @Secured({"ROLE_ADMIN","ROLE_SALE","ROLE_AUTHOR"})
    @PostMapping("/create")
    public String CreateBlog() {
        return "Create blog";
    }

    @Secured({"ROLE_ADMIN","ROLE_SALE","ROLE_AUTHOR"})
    @PutMapping("/update/{id}")
    public String updateBlog(@PathVariable Integer id) {
        return "Update blog " + id;
    }

    @Secured({"ROLE_ADMIN","ROLE_SALE","ROLE_AUTHOR"})
    @DeleteMapping("/{id}")
    public String delateBlog(@PathVariable Integer id) {
        return "Delete blog " + id;
    }
}
