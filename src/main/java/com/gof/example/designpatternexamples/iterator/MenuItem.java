package com.gof.example.designpatternexamples.iterator;

import java.util.Iterator;

public class MenuItem {

    private String name;
    private String description;
    private boolean vagitarian;
    private double price;

    public MenuItem(String name, String description, boolean vagitarian, double price) {
        this.name = name;
        this.description = description;
        this.vagitarian = vagitarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVagitarian() {
        return vagitarian;
    }

    public void setVagitarian(boolean vagitarian) {
        this.vagitarian = vagitarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vagitarian=" + vagitarian +
                ", price=" + price +
                '}';
    }
}
