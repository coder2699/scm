package com.myproject.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    // dashboard page
    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "user/dashboard";
    }

    // profile page
    @GetMapping("/profile")
    public String profilePage() {
        return "user/profile";
    }
    
}
