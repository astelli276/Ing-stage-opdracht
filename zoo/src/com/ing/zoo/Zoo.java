package com.ing.zoo;

import com.ing.zoo.animal.*;
import com.ing.zoo.commands.*;

import java.util.*;

public class Zoo {
    public static void main(String[] args)
    {
        Map<String, GiveCommand> commandMap = new HashMap<>();
        commandMap.put("hello", new HelloCommand());
        commandMap.put("give meat", new EatmeatCommand());
        commandMap.put("give leaves", new EatLeavesCommand());
        commandMap.put("perform trick", new PerformTrickCommand());
        commandMap.put("exit", new QuitCommand());

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Bear baloo = new Bear("baloo");
        Penguin gunter = new Penguin("gunter");

        List<Animal> animals = Arrays.asList(henk, elsa, dora, wally, marty, baloo, gunter);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nVoer uw command in: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String commandKey = parts[0].equals("hello") && parts.length > 1 ? "hello" : input.trim();
            String argument = parts.length > 1 ? parts[1] : null;

            GiveCommand command = commandMap.get(commandKey);
            if (command != null) {
                command.execute(animals, argument);
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}
