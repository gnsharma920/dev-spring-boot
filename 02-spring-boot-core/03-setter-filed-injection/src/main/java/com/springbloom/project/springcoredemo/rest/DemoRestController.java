package com.springbloom.project.springcoredemo.rest;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

//    Field injection
//    @Autowired
//    private Coach coach;

    private Coach coach;

    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailWorkout();
    }
}
