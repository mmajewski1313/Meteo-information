package com.mmajewski;

import java.util.Observable;

/**
 * Created by Michał on 2017-05-07.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void readingChange() {
        setChanged();                       //setChanged ustawia flagę - stan obiektu zmienił się.
        notifyObservers();                  // wysyła powiadomienia
    }

    public void setReading(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        readingChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
