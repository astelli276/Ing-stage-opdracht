package com.ing.zoo.commands;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.behaviour.EatEverything;
import com.ing.zoo.behaviour.EatMeat;
import com.ing.zoo.behaviour.Eating;

import java.util.List;

public class EatmeatCommand implements GiveCommand{
    @Override
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal : animals) {
            Eating eating = animal.getEatingBehaviour();
            if (eating instanceof EatMeat || eating instanceof EatEverything) {
                animal.eat();
            }
        }
    }
}
