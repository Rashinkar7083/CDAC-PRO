package com.example.MainProjectAll.controller;


import com.example.MainProjectAll.entity.Location;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("location", new Location());
        return "index";
    }
}

