package com.gof.example.designpatternexamples.strategy.behavior.impl;

import com.gof.example.designpatternexamples.strategy.behavior.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
