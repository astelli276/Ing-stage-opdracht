package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatLeaves;


public class Zebra extends Animal {
    public Zebra(String name) {
        super(name);
        this.eating = new EatLeaves();
        this.performTrick = null;
    }

    @Override
    protected String getHelloText() {
        return "zebra zebra";
    }
}
