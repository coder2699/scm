package com.myproject.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page enter");
        model.addAttribute("name", "Pranshu Pandey");
        model.addAttribute("githubRepo", "https://github.com/coder2699/");
        return "home";
    }


    // about route
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About page loading");
        return "about";
    }

    // services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    // contact
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    // login
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    // contact
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
    
}
