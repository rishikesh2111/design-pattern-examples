package com.gof.example.designpatternexamples.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    public StatisticsDisplay(WeatherData weatherData){
        this.observable = weatherData;
        weatherData.addObserver(this);
    }
    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }

    private String temprature;

    @Override
    public void update(String temp) {
      System.out.println("Temprature updated in StatisticsDisplay : "+temp);
    }

    @Override
    public void display() {
        System.out.println("Temprature updated in StatisticsDisplay  "+getTemprature());
    }
}
