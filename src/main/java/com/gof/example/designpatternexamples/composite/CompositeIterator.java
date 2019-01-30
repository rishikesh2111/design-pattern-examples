package com.gof.example.designpatternexamples.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }


    @Override
    public boolean hasNext() {
       if(stack.empty()){
           return false;
       }else {
           Iterator<MenuComponent> componentIterator  = stack.peek();
           if(!componentIterator.hasNext()){
               stack.pop();
               return hasNext();
           }else{
               return true;
           }
       }

    }

    @Override
    public Object next() {
      if(hasNext()){
         Iterator<MenuComponent> menuComponentIterator = stack.peek();
          MenuComponent menuComponent = menuComponentIterator.next();

          stack.push(menuComponent.createIterator());

          return menuComponent;
      }else{
          return null;
      }


    }
}

