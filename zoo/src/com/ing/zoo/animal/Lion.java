package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatMeat;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
        this.eating = new EatMeat();
        this.performTrick = null;
    }

    @Override
    protected String getHelloText() {
        return "roooaoaaaaar";
    }
}
