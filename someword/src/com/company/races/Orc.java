package com.company.races;

import com.company.typeOfWalk.run;

public class Orc extends race implements intRace{
    public Orc() {
        super(new run());
    }
    @Override
    public void SayYourRace() {
        System.out.println("I am Orc");
    }
}
