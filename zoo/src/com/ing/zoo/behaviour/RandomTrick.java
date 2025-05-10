package com.ing.zoo.behaviour;

import java.util.Random;

public class RandomTrick implements PerformTrick {
    private final String[] tricks;
    private final Random random;

    public RandomTrick(String... tricks) {
        this.tricks = tricks;
        this.random = new Random();
    }

    @Override
    public void performTrick(String animalName) {
        int index = random.nextInt(tricks.length);
        System.out.println(animalName + ": " + tricks[index]);
    }
}
