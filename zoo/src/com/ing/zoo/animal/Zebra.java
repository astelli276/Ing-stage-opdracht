package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatLeaves;
import com.ing.zoo.behaviour.NoTrick;


public class Zebra extends Animal {
    public Zebra(String name) {
        super(name);
        this.eating = new EatLeaves();
        this.performTrick = new NoTrick();
    }

    @Override
    protected String getHelloText() {
        return "zebra zebra";
    }
}
