package com.company.races;

import com.company.typeOfWalk.fly;

public class phoenix extends race implements intRace{
    public phoenix() {
        super(new fly());
    }
    @Override
    public void SayYourRace() {
        System.out.println("I am phoenix");
    }

}