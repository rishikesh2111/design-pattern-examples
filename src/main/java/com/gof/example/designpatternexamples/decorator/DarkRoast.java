package com.gof.example.designpatternexamples.decorator;

public class DarkRoast extends Bevarage {
    public DarkRoast(){
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
