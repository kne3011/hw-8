package com.company;

import com.company.races.*;
import com.company.typeOfWalk.*;

public class Main {
    public static void main(String[] args) {
        Orc orc = new Orc();
        orc.SayYourRace();
        orc.walk();
        phoenix phoenix = new phoenix();
        phoenix.SayYourRace();
        phoenix.walk();
        System.out.println("Human transformation");
        phoenix.useMagic(new run());
        phoenix.SayYourRace();
        phoenix.walk();
        vampire vampire = new vampire();
        vampire.SayYourRace();
        vampire.walk();
        System.out.println("Bat transformation");
        vampire.useMagic(new fly());
        vampire.walk();
        Dragon Dragon = new Dragon();
        Dragon.SayYourRace();
        Dragon.walk();
    }
}
