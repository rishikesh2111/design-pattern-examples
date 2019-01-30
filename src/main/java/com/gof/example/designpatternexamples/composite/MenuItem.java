package com.gof.example.designpatternexamples.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
    public Iterator<MenuComponent> createIterator(){
        return new NullIterator();
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("---------Menu Item----------");
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println(getPrice());
        System.out.println(isVegetarian());
    }

    String name;
    String description;
    boolean vegetarian;
    double price;
}
