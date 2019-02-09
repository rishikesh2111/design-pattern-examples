package com.gof.example.designpatternexamples.decorator;

public class HouseBlend extends Bevarage {
    public HouseBlend(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return .99;
    }
}
