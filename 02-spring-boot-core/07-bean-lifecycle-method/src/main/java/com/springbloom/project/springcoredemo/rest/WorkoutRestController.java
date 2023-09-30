package com.springbloom.project.springcoredemo.rest;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutRestController {
    private Coach coach;

    private Coach theCoach;
    @Autowired
    public void setCoach(Coach coach, Coach theCoach) {
        System.out.println("In Constructor "+ getClass().getName());
        System.out.println("Coach impl class : "+ coach.getClass().getName());
        System.out.println("The coach impl class : "+ theCoach.getClass().getName());
        this.coach = coach;
        this.theCoach=theCoach;
    }

    @GetMapping("/checkScope")
    public Boolean checkScope(){
        return coach == theCoach;
    }

    @GetMapping("/getWorkout")
    public String getWorkout(){
        return coach.getDailWorkout();
    }
}
