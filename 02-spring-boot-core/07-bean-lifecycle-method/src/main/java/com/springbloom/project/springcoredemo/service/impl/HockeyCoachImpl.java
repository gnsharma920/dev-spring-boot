package com.springbloom.project.springcoredemo.service.impl;

import com.springbloom.project.springcoredemo.service.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HockeyCoachImpl implements Coach {

    @PostConstruct
    public void init(){
        System.out.println("In Init method : "+ getClass().getName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("In preDestroy method : "+ getClass().getName());
    }
    public HockeyCoachImpl() {
        System.out.println("In Constructor "+ getClass().getName());
    }

    @Override
    public String getDailWorkout() {
        return "Play Hockey for 15 minutes!!";
    }
}
