package com.example.springsecurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/order")
public class OrderController {
    @GetMapping
    public String getOrder(){
        return "Get order";
    }
    @PostMapping("/create")
    public String CreateOrder(){
        return "Create order";
    }
    @PutMapping("/update/{id}")
    public String updateOrder(@PathVariable Integer id){
        return "update order " +id;
    }
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Integer id){
        return "delete order " + id;
    }
}
