package com.my.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;



@Controller
public class GalleryController {
    
    
  

    @GetMapping("/gallery")
    public String gallery(Model model) {
        return "gallery"; // Maps to gallery.html
    }

}
