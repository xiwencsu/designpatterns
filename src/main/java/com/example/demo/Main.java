package com.example.demo;

/*
 * Claire
 * @date  2020/7/25 下午9:55
 *
 */

import observerdesignpattern.weatherstation.CurrentConditionsDisplay;
import observerdesignpattern.weatherstation.WeatherData;


public class Main {
    public static void main(String[] args) {
       /* ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.registerObserver(new ConcreteObserverOne());
        concreteSubject.registerObserver(new ConcreteObserverTwo());
        concreteSubject.notifyObserver(new Message(111,"wenxi"));*/
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(88,89,78);
    }
}
