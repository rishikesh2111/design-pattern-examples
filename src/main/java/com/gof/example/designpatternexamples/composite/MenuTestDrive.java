package com.gof.example.designpatternexamples.composite;

public class MenuTestDrive {

    public static void main(String[] args){
        MenuComponent dinerMenu = new Menu("Diner","Diner Menu");
        MenuComponent cafeMenu = new Menu("Cafe","Cafe Menu");
        MenuComponent dessertMenu = new Menu("Desert","Dessert Menu");
        MenuComponent  pancakeMenu = new Menu("Pancake","Pancake Menu");

        MenuComponent  allMenu = new Menu("All Menuu","All Menu Combined");
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);
        allMenu.add(pancakeMenu);

        //Add Menu items for diner
        dinerMenu.add(new MenuItem("Pasta","White sauce",true,290));
        dinerMenu.add(new MenuItem("Tandoori chicken","tandoori chicken full",true,290));

        dinerMenu.add(dessertMenu);

        //Add menu item for dessert
        dessertMenu.add(new MenuItem("vanila","vanila ice cream",true,90));

        //Add menu item for cafe
        cafeMenu.add(new MenuItem("Cold coffee","coffee with ice cream",true,150));

        //Add menu item for cafe
        pancakeMenu.add(new MenuItem("Pan cake","indian pan cake",true,50));

        Waitress waitress = new Waitress(allMenu);
        waitress.print();
    }
}
