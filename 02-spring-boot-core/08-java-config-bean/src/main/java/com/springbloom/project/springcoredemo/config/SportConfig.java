package com.springbloom.project.springcoredemo.config;

import com.springbloom.project.springcoredemo.service.impl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public SwimCoach swimCoach(){
        return new SwimCoach();
    }
}
