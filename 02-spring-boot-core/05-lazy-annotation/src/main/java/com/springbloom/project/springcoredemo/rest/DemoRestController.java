package com.springbloom.project.springcoredemo.rest;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach coach;
    @Autowired
    public void setCoach(@Qualifier("hockeyCoachImpl") Coach coach) {
        System.out.println("In Constructor "+ getClass().getName());
        this.coach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailWorkout();
    }
}
