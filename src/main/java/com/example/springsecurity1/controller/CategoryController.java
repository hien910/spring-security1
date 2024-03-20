package com.example.springsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @GetMapping
    public String getCategory(){
        return "Get category";
    }
    @PostMapping("/create")
    public String CreateCategory(){
        return "Create category";
    }
    @PutMapping("/update/{id}")
    public String updateCategory(@PathVariable Integer id){
        return "update category " +id;
    }
    @DeleteMapping("/{id}")
    public String delateCategory(@PathVariable Integer id){
        return "delete category " + id;
    }
}
