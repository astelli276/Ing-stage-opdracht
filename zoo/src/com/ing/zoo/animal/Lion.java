package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatMeat;
import com.ing.zoo.behaviour.NoTrick;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
        this.eating = new EatMeat();
        this.performTrick = new NoTrick();
    }

    @Override
    protected String getHelloText() {
        return "roooaoaaaaar";
    }
}
