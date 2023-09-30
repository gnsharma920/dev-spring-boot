package com.springbloom.projects.demoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${tech.name}")
    private String techName;

    @GetMapping("/")
    public String syaHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5km!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }

    @GetMapping("/techLearning")
    public String getDetails(){
        return "Tech Name: "+ techName + ", Coach Name: "+ coachName;
    }
}
