package com.gof.example.designpatternexamples.strategy;

import com.gof.example.designpatternexamples.strategy.behavior.impl.FlyNoWay;
import com.gof.example.designpatternexamples.strategy.behavior.impl.FlyWithWings;
import com.gof.example.designpatternexamples.strategy.behavior.impl.Quack;

public class ModelDuck extends Duck {


    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
