package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoachImpl implements Coach {

    @PostConstruct
    public void init(){
        System.out.println("In Init method : "+ getClass().getName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("In preDestroy method : "+ getClass().getName());
    }

    public CricketCoachImpl() {
        System.out.println("In Constructor "+ getClass().getName());
    }

    @Override
    public String getDailWorkout() {
        return "Practice fast bowling for 15 min";
    }
}
