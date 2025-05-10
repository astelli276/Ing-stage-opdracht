package com.ing.zoo.behaviour;

public class NoTrick implements PerformTrick{
    @Override
    public void performTrick(String animalName) {
        System.out.printf("%s: I can't do a trick%n", animalName);
    }
}
