package com.example.l4e1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



    @GetMapping("/demo")
    public String demo(){
        return "demo";
    }
}
