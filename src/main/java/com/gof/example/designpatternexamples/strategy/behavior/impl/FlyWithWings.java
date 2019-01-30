package com.gof.example.designpatternexamples.strategy.behavior.impl;

import com.gof.example.designpatternexamples.strategy.behavior.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
