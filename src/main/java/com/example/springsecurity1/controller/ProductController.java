package com.example.springsecurity1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Secured({"ROLE_ADMIN","ROLE_SALE"})
    @GetMapping
    public String getProduct(){
        return "Get product";
    }

    @Secured({"ROLE_ADMIN","ROLE_SALE"})
    @PostMapping("/create")
    public String CreateProduct(){
        return "Create product";
    }

    @Secured({"ROLE_ADMIN","ROLE_SALE"})
    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable Integer id){
        return "update product " +id;
    }

    @Secured({"ROLE_ADMIN","ROLE_SALE"})
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return "delete product " + id;
    }
}