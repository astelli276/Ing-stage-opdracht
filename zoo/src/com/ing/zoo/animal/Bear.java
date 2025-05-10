package com.ing.zoo.animal;

import com.ing.zoo.behaviour.EatEverything;
import com.ing.zoo.behaviour.RandomTrick;

public class Bear extends Animal{
    public Bear(String name){
        super(name);
        this.eating = new EatEverything();
        this.performTrick = new RandomTrick("Balance on ball", "Waving High");
    }

    @Override
    protected String getHelloText() {
        return "grrr growl huf huf";
    }
}
