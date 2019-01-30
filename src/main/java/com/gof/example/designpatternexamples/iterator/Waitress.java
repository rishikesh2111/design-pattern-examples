package com.gof.example.designpatternexamples.iterator;

import java.util.Iterator;

public class Waitress {

    static PancakeMenu pancakeMenu = new PancakeMenu();
    static DinerMenu dinerMenu = new DinerMenu();
    public static void main(String[] args){
        printMenu();
    }


    private static void printMenu(){
     System.out.println("Print Pancake Menu");
     //  Iterator pancakeIterator = pancakeMenu.createIterator();
       Iterator dinerMenuIterator = dinerMenu.createIterator();
      //  iterateMenu(pancakeIterator);
        System.out.println("Print Diner Menu");
        iterateMenu(dinerMenuIterator);
        dinerMenuIterator.remove();
        dinerMenuIterator.remove();
        iterateMenu(dinerMenuIterator);


    }

    private static void iterateMenu(Iterator iterator){
        while(iterator.hasNext()){
            iterator.next();
        }
    }
}
