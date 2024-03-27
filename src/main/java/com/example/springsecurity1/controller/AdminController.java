package com.example.springsecurity1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/user")
public class AdminController {
    @Secured({"ROLE_ADMIN"})
    @GetMapping
    public String getAllUser(){
        return "Get All user";
    }

    @Secured({"ROLE_ADMIN"})
    @PostMapping("/create")
    public String CreateUser(){
        return "Create user";
    }

    @Secured({"ROLE_ADMIN"})
    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable Integer id){
        return "update user " +id;
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id){
        return "delete user " + id;
    }

}
