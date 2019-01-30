package com.gof.example.designpatternexamples.iterator;

import java.util.Iterator;

public class DinerMenu implements Iterator {

    static final int MAX_ITEMS = 4;
    MenuItem[] menuItems;
    int noOfItems = 0;
    int position = -1;
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        menuItems[0] = new MenuItem("diner 1","pancake with egg",true, 12.50);
        menuItems[1] = new MenuItem("doner  2","pancake with veggie",true, 15.50);
        menuItems[2] = new MenuItem("diner 3","pancake with honey",true, 10.50);
        menuItems[3] = new MenuItem("diner 4","pancake with tamrind",true, 11.50);


    }

    public void addItem(String name, String description, boolean vagitarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vagitarian, price);
        if(noOfItems >= MAX_ITEMS){
            System.out.println("Menu is full , can't print any more item");
        }else {
            menuItems[noOfItems] = menuItem;
            noOfItems += 1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenu();
    }
    @Override
    public boolean hasNext() {
        position = position+1;
        while(position < menuItems.length && menuItems[position] != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        System.out.println(menuItems[position]);
        return menuItems[position];
    }
    @Override
    public void remove() {
      position = -1;
      for(int i = 0; i< menuItems.length; i++){
          if(!(i == menuItems.length-1)) {
              menuItems[i] = menuItems[i + 1];
          }else{
              menuItems[i] = null;
          }
      }
    }
}
