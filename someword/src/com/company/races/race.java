package com.company.races;

import com.company.typeOfWalk.walkType;

public class race {
    private walkType walkType;

    public race(com.company.typeOfWalk.walkType walkType) {
        this.walkType = walkType;
    }
    public void walk(){
        this.walkType.walk();
    }
    public void useMagic(walkType walkType){
        this.walkType = walkType;
    }
}
