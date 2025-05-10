package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatEverything;
import com.ing.zoo.behaviour.RandomTrick;

public class Pig extends Animal{

    public Pig(String name){
        super(name);
        this.eating = new EatEverything();
        this.performTrick = new RandomTrick("rolls in the mud", "runs in circles");

    }

    @Override
    protected String getHelloText() {
        return "splash";
    }
}
