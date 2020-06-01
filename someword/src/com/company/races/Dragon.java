package com.company.races;

import com.company.typeOfWalk.runAndFly;

public class Dragon extends race implements intRace{
    public Dragon() {
        super(new runAndFly());
    }
    @Override
    public void SayYourRace() {
        System.out.println("I am Dragon");
    }

}
