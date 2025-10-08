package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.stereotype.Component;

//you have notice something that we have not using the component
public class Swincoach implements Coach{

    public void SwinCoach(){
        System.out.println("This is swin constructor--"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Swin 5km daily for swinning!!";
    }
}
