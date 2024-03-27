package com.example.springsecurity1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {
    @GetMapping("/") // ai cũng có thể truy cập
    public String getHome() {
        return "index";
    }

//    @GetMapping("/sale")
//    public String getSale() {
//        return "Sale Page";
//    }
@Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }

//    @GetMapping("/author")
//    public String getAuthor() {
//        return "Author Page";
//    }
    @Secured("ROLE_USER")
    @GetMapping("/user")
    public String getUser() {
        return "user";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
//    @GetMapping("/dashboard")
//    public String getDashboard() {
//        return "Dashboard Page";
//    }
//    @GetMapping("/info")
//    public ResponseEntity<?> getInfo() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return ResponseEntity.ok(authentication);
//    }

}
