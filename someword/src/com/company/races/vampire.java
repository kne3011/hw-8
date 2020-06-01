package com.company.races;

import com.company.typeOfWalk.run;

public class vampire extends race implements intRace{
    public vampire() {
        super(new run());
    }
    @Override
    public void SayYourRace() {
        System.out.println("I am vampire");
    }
}
