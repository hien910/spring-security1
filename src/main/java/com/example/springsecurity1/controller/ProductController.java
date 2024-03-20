package com.example.springsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public String getProduct(){
        return "Get product";
    }
    @PostMapping("/create")
    public String CreateProduct(){
        return "Create product";
    }
    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable Integer id){
        return "update product " +id;
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return "delete product " + id;
    }
}