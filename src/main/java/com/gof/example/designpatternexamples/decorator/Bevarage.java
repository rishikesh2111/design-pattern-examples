package com.gof.example.designpatternexamples.decorator;

public abstract class Bevarage {
    public String getDescription() {
        return description;
    }

    String description = "unknown bevarage";

    public abstract double cost();

}
