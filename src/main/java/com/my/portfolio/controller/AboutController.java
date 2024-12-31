package com.my.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String about() {
        return "about"; // Maps to about.html
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }

}
