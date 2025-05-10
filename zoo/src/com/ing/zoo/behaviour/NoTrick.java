package com.ing.zoo.behaviour;

public class NoTrick implements PerformTrick{
    @Override
    public void performTrick() {
        System.out.println("I can't do a trick");
    }
}
