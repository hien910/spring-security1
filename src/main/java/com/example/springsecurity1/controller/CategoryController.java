package com.example.springsecurity1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @GetMapping
    public String getCategory(){
        return "Get category";
    }

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @PostMapping("/create")
    public String CreateCategory(){
        return "Create category";
    }

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @PutMapping("/update/{id}")
    public String updateCategory(@PathVariable Integer id){
        return "update category " +id;
    }

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @DeleteMapping("/{id}")
    public String delateCategory(@PathVariable Integer id){
        return "delete category " + id;
    }
}
