package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoachImpl implements Coach {

    @PostConstruct
    public void init(){
        System.out.println("In Init method : "+ getClass().getName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("In preDestroy method : "+ getClass().getName());
    }

    public TrackCoachImpl() {
        System.out.println("In Constructor "+ getClass().getName());
    }

    @Override
    public String getDailWorkout() {
        return "Run and walk for 60 minutes!!";
    }
}
