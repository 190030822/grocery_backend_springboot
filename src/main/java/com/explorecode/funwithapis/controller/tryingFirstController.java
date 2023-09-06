package com.explorecode.funwithapis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tryingFirstController {
    
    @GetMapping("/") 
    public String firstendpoint() {
        return "Happy to do with first endpoint. Successfully runned";
    }
}
