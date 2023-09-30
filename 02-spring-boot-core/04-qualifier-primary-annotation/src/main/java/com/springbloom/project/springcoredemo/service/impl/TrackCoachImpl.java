package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoachImpl implements Coach {
    @Override
    public String getDailWorkout() {
        return "Run and walk for 60 minutes!!";
    }
}
