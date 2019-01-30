package com.gof.example.designpatternexamples.strategy;

import com.gof.example.designpatternexamples.strategy.behavior.impl.FlyRocketPowered;

public class DuckSimulator {

    public static void main(String[] args){
        Duck duck = new MallardDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}

