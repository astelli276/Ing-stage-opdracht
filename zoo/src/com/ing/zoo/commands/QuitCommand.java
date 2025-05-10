package com.ing.zoo.commands;

import com.ing.zoo.animal.Animal;

import java.util.List;

public class QuitCommand implements GiveCommand {
    @Override
    public void execute(List<Animal> animals, String argument) {
        System.out.println("Zoo is closing... Good bye!");
        System.exit(0);
    }
}
