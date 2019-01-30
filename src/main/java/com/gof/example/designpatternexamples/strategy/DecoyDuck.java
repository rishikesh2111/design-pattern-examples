package com.gof.example.designpatternexamples.strategy;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Rubber duck");
    }
}
