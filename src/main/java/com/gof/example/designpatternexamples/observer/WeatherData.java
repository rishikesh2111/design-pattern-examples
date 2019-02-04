package com.gof.example.designpatternexamples.observer;

import java.util.ArrayList;

public class WeatherData implements Observable {
    ArrayList<Observer> observers;
    public String temprature;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    public void measurementChanged(String temprature){
        this.temprature = temprature;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(temprature);
        }
    }
}
