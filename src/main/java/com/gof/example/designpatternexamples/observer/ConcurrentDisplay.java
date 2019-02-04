package com.gof.example.designpatternexamples.observer;

public class ConcurrentDisplay implements Observer, DisplayElement {
    Observable observable;
    private String temprature;
    public ConcurrentDisplay(WeatherData weatherData){
        this.observable = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(String temprature) {
     this.temprature = temprature;
     display();
    }

    @Override
    public void display() {
        System.out.println("Temprature updated in ConcurrentDisplay  "+temprature);
    }
}
