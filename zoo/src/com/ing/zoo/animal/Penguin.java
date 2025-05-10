package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatMeat;

public class Penguin extends Animal{

    public Penguin(String name) {
        super(name);
        this.eating = new EatMeat();
        this.performTrick = null;
    }
    @Override
    protected String getHelloText() {
        return "noot noot";
    }
}
