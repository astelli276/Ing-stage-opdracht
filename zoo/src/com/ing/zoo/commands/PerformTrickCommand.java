package com.ing.zoo.commands;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.behaviour.PerformTrick;

import java.util.List;

public class PerformTrickCommand implements GiveCommand{
    @Override
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal : animals) {
            PerformTrick trick = animal.getTrickBehaviour();
            if (trick != null) {
                animal.performTrick();
            }
        }
    }
}
