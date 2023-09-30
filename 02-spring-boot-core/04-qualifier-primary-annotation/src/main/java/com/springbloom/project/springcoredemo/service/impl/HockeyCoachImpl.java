package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoachImpl implements Coach {
    @Override
    public String getDailWorkout() {
        return "Play Hockey for 15 minutes!!";
    }
}
