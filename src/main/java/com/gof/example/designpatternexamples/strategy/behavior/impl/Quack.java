package com.gof.example.designpatternexamples.strategy.behavior.impl;

import com.gof.example.designpatternexamples.strategy.behavior.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
