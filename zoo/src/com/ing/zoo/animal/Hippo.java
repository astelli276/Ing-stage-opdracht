package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatLeaves;

public class Hippo extends Animal{

    public Hippo(String name){
        super(name);
        this.eating = new EatLeaves();
        this.performTrick = null;
    }

    @Override
    protected String getHelloText() {
        return "splash";
    }
}
