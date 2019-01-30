package com.gof.example.designpatternexamples.strategy;

import com.gof.example.designpatternexamples.strategy.behavior.FlyBehaviour;
import com.gof.example.designpatternexamples.strategy.behavior.QuackBehaviour;

public abstract class Duck {

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
         quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }

    public void display(){
        System.out.println("Duck");
    }
}
