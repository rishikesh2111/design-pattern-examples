package com.gof.example.designpatternexamples.decorator;

public abstract class CondimentDecorator extends Bevarage {
    public abstract String getDescription();
        @Override
    public double cost() {
        return 1;
    }
}
