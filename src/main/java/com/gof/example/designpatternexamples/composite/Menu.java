package com.gof.example.designpatternexamples.composite;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    Iterator<MenuComponent> iterator = null;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    String name;
    String description;
    public Iterator<MenuComponent> createIterator(){
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
    @Override
    public void print() {
        System.out.println("---------------------------");
        System.out.print(getName()+", ");
        System.out.println(getDescription());
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
}
