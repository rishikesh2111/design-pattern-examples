package com.gof.example.designpatternexamples.strategy.behavior.impl;

import com.gof.example.designpatternexamples.strategy.behavior.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly rocket powered");
    }
}
