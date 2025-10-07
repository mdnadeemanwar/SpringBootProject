package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cricketcoach implements Coach {

    public Cricketcoach(){
        System.out.println("Cricket Coach-------"+getClass().getName());
    }

    @Override
    public String getDailyWorkout(){
        return "Run 10km daily to get the Result!!!!!!";
    }
}
