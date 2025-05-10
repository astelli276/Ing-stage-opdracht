package com.ing.zoo.commands;

import com.ing.zoo.animal.Animal;

import java.util.List;

public class HelloCommand implements GiveCommand {
    @Override
    public void execute(List<Animal> animals, String argument) {
        if (argument == null) {
            animals.forEach(Animal::sayHello);
        } else {
            Animal animal = animals.stream()
                    .filter(a -> a.getName().equalsIgnoreCase(argument))
                    .findFirst()
                    .orElse(null);

            if (animal != null) {
                animal.sayHello();
            } else {
                System.out.println("No animal named " + argument);
            }
        }
    }
}
