package com.gof.example.designpatternexamples.observer;


public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        ConcurrentDisplay concurrentDisplay = new ConcurrentDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.measurementChanged("80");
        weatherData.measurementChanged("90");
    }
}
