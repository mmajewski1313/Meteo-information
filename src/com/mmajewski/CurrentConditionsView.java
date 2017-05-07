package com.mmajewski;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Michał on 2017-05-07.
 */
public class CurrentConditionsView implements Observer, ElementView {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsView(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            show();

        }
    }

    @Override
    public void show() {
        System.out.println("Current conditions: " +temperature + "  C and  "+ humidity + " % humidity");
    }
}
