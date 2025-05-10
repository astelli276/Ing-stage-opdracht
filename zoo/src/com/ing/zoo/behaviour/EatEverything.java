package com.ing.zoo.behaviour;

public class EatEverything implements Eating{
    @Override
    public void eat(String animalName) {
        System.out.printf("%s: I eat everything, meat and leaves%n", animalName);


    }
}
