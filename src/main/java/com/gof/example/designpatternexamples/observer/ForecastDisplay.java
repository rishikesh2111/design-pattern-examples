package com.gof.example.designpatternexamples.observer;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    public ForecastDisplay(WeatherData weatherData){
        this.observable = weatherData;
        weatherData.addObserver(this);
    }
    private String temprature;

    @Override
    public void update(String temp) {
      this.temprature = temp;
      display();
    }

    @Override
    public void display() {
     System.out.println("Temprature updated in ForecastDisplay  "+temprature);
    }
}
