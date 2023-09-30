package com.springbloom.projects.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String syaHello(){
        return "Hello World!";
    }
}
