package com.gof.example.designpatternexamples.observer.javaimpl;


import java.util.Observable;

public class WeatherStation {

    public static void main(String[] args){
        Observable weatherData = new WeatherData();
        ConcurrentDisplay concurrentDisplay = new ConcurrentDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        ((WeatherData) weatherData).setMeasurement("50");
        ((WeatherData) weatherData).setMeasurement("K50");

    }
}
