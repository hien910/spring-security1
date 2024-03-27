package com.example.springsecurity1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
public class OrderController {
    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @GetMapping
    public String getOrder(){
        return "Get order";
    }

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @PostMapping("/create")
    public String CreateOrder(){
        return "Create order";
    }

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @PutMapping("/update/{id}")
    public String updateOrder(@PathVariable Integer id){
        return "update order " +id;
    }

    @PreAuthorize("hasAnyRole('ADMIN','SALE')")
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Integer id){
        return "delete order " + id;
    }
}
