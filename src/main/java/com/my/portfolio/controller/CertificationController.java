package com.my.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;



@Controller
public class CertificationController {



    @GetMapping("/certifications")
    public String certifications(Model model) {
        return "certifications"; // Maps to certifications.html
    }

}
