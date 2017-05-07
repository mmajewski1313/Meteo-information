package com.mmajewski;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Michał on 2017-05-07.
 */
public class ForecastView implements Observer, ElementView {

    public float currentPressure = 1010.1f;
    private float lastPressure;

    public ForecastView(Observable observable) {            //konstruktor klasy pobiera obiekt klasy Observable
        WeatherData weatherData = (WeatherData) observable;
        observable.addObserver(this);                   //wpisanie obiektu na listę obserwatorów
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {                     // sprawdzamy czy obiekt obserwowany jest typu WeatherData
            WeatherData weatherData= (WeatherData)o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            show();
        }
    }

    @Override
    public void show() {
        /* TODO */
    }
}
