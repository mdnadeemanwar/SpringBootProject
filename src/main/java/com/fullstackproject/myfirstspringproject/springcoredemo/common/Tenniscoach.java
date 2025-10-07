package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Tenniscoach implements Coach{

    public Tenniscoach(){
        System.out.println("TennisCoach------"+getClass().getName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run 12 Km for Tennis coaching!!!";
    }
}
