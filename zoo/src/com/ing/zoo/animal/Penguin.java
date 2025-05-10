package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatMeat;
import com.ing.zoo.behaviour.NoTrick;

public class Penguin extends Animal{

    public Penguin(String name) {
        super(name);
        this.eating = new EatMeat();
        this.performTrick = new NoTrick();
    }
    @Override
    protected String getHelloText() {
        return "noot noot";
    }
}
