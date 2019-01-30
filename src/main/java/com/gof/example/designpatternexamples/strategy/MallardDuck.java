package com.gof.example.designpatternexamples.strategy;

import com.gof.example.designpatternexamples.strategy.behavior.impl.FlyWithWings;
import com.gof.example.designpatternexamples.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
