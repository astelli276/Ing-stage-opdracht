package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatMeat;
import com.ing.zoo.behaviour.PerformTrick;
import com.ing.zoo.behaviour.RandomTrick;

public class Tiger extends Animal {

    public Tiger(String name){
        super(name);
        this.eating = new EatMeat();
        this.performTrick = new RandomTrick("jumps in tree", "scratches ears");
    }
    @Override
    protected String getHelloText() {
        return "rraaarww";
    }
}
