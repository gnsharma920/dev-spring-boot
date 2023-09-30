package com.springbloom.project.springcoredemo.rest;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutRestController {
    private Coach coach;

    @Autowired
    public void setCoach(Coach coach, Coach theCoach) {
        this.coach = coach;
    }

    @GetMapping("/getWorkout")
    public String getWorkout(){
        return coach.getDailWorkout();
    }
}
