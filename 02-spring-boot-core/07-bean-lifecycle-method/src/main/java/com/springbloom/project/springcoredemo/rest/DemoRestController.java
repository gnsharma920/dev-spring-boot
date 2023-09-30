package com.springbloom.project.springcoredemo.rest;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private Coach coach;
    private Coach theCoach;
    @Autowired
    public void setCoach(@Qualifier("hockeyCoachImpl") Coach coach,@Qualifier("hockeyCoachImpl") Coach theCoach) {
        System.out.println("In Constructor "+ getClass().getName());
        this.coach = coach;
        this.theCoach = theCoach;
    }

    @GetMapping("/check")
    public Boolean check(){
        return coach == theCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailWorkout();
    }
}
