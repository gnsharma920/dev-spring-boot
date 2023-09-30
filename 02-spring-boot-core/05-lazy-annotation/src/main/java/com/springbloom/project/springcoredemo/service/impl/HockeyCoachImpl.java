package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoachImpl implements Coach {

    public HockeyCoachImpl() {
        System.out.println("In Constructor "+ getClass().getName());
    }

    @Override
    public String getDailWorkout() {
        return "Play Hockey for 15 minutes!!";
    }
}
