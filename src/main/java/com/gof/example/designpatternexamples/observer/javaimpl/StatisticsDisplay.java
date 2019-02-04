package com.gof.example.designpatternexamples.observer.javaimpl;

import com.gof.example.designpatternexamples.observer.DisplayElement;
import com.gof.example.designpatternexamples.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    private String temprature;


    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable obj, Object arg) {
        if(obj instanceof com.gof.example.designpatternexamples.observer.javaimpl.WeatherData){
            com.gof.example.designpatternexamples.observer.javaimpl.WeatherData weatherData = (com.gof.example.designpatternexamples.observer.javaimpl.WeatherData)obj;
            this.temprature = weatherData.getTemprature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Temprature updated in StatisticsDisplay  "+temprature);
    }
}
