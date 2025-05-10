package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatLeaves;
import com.ing.zoo.behaviour.NoTrick;

public class Hippo extends Animal{

    public Hippo(String name){
        super(name);
        this.eating = new EatLeaves();
        this.performTrick = new NoTrick();
    }

    @Override
    protected String getHelloText() {
        return "splash";
    }
}
