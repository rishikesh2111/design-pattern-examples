package com.gof.example.designpatternexamples.composite;

public class Waitress {
    MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }
    public void print() {
        allMenu.print();
    }

}
