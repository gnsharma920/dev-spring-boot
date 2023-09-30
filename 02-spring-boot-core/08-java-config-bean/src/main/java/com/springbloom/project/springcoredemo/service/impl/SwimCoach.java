package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In Constructor "+ getClass().getName());
    }

    @Override
    public String getDailWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
