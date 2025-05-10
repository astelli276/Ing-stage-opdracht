package com.ing.zoo.behaviour;

public class EatEverything implements Eating{
    @Override
    public void eat() {
        System.out.println("I eat everything, meat and leaves");
    }
}
