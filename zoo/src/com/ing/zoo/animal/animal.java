package com.ing.zoo.animal;

import com.ing.zoo.behaviour.Eating;
import com.ing.zoo.behaviour.PerformTrick;

public abstract class Animal {
    String name;
    protected Eating eating;
    protected PerformTrick performTrick;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Eating getEatingBehaviour() {
        return eating;
    }

    public PerformTrick getTrickBehaviour() {
        return performTrick;
    }

    public void sayHello() {
        System.out.println(name + ": " + getHelloText());
    }

    protected abstract String getHelloText();

    public void eat() {
        if (eating != null)
            eating.eat(name);
    }

    public void performTrick() {
        if (performTrick != null)
            performTrick.performTrick(name);
    }
}
