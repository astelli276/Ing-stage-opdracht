package com.ing.zoo.commands;

import com.ing.zoo.animal.Animal;

import java.util.List;

public interface GiveCommand {
    void execute(List<Animal> animals, String argument);
}
