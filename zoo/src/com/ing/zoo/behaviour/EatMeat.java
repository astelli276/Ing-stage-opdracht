package com.ing.zoo.behaviour;

public class EatMeat implements Eating {
    @Override
    public void eat(String animalName) {
        System.out.printf("%s: Eating meat%n", animalName);
    }
}
