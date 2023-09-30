package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoachImpl implements Coach {

    @Override
    public String getDailWorkout() {
        return "Practice fast bowling for 15 min";
    }
}
