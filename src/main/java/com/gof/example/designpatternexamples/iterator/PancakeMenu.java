package com.gof.example.designpatternexamples.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeMenu {

    List<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("pancake 1","pancake with egg",true, 12.50));
        menuItems.add(new MenuItem("pancake 2","pancake with veggie",true, 15.50));
        menuItems.add(new MenuItem("pancake 3","pancake with honey",true, 10.50));
        menuItems.add(new MenuItem("pancake 4","pancake with tamrind",true, 11.50));
    }

    public void addItem(String name, String description, boolean vagitarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vagitarian, price);
    }
    public Iterator createIterator(){
        return menuItems.iterator();
    }


}
