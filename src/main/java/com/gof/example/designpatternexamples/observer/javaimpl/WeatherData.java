package com.gof.example.designpatternexamples.observer.javaimpl;


import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    public WeatherData() {
    }

    public String getTemprature() {
        return temprature;
    }

    public String temprature;
    public void measurementChanged(){
     setChanged();
     notifyObservers();

}
public void setMeasurement(String temprature){
        this.temprature = temprature;
        measurementChanged();
}


}
