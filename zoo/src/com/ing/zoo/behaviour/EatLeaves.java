package com.ing.zoo.behaviour;

public class EatLeaves implements Eating{
    @Override
    public void eat(String animalName) {
        System.out.printf("%s: Eating leaves%n", animalName);
    }
}
