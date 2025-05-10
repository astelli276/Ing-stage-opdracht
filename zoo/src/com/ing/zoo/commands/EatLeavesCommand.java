package com.ing.zoo.commands;

import com.ing.zoo.animal.Animal;
import com.ing.zoo.behaviour.EatEverything;
import com.ing.zoo.behaviour.EatLeaves;
import com.ing.zoo.behaviour.EatMeat;
import com.ing.zoo.behaviour.Eating;

import java.util.List;

public class EatLeavesCommand implements GiveCommand{
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal : animals) {
            Eating eating = animal.getEatingBehaviour();
            if (eating instanceof EatLeaves || eating instanceof EatEverything) {
                animal.eat();
            }
        }
    }
}
