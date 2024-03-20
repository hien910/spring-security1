package com.example.springsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/user")
public class AdminController {
    @GetMapping
    public String getAllUser(){
        return "Get All user";
    }
    @PostMapping("/create")
    public String CreateUser(){
        return "Create user";
    }
    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable Integer id){
        return "update user " +id;
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id){
        return "delete user " + id;
    }

}
