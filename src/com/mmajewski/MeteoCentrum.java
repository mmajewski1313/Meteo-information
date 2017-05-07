package com.mmajewski;

/**
 * Created by Michał on 2017-05-07.
 */
public class MeteoCentrum {

    public static void main(String[] args){
        WeatherData weatherData= new WeatherData();

        CurrentConditionsView currentConditionsView = new CurrentConditionsView(weatherData);
        ForecastView forecastView = new ForecastView(weatherData);

        weatherData.setReading(26.5f, 65, 1013.1f);
        weatherData.setReading(30.5f, 85, 1012.1f);
        weatherData.setReading(14.5f, 15, 1003.1f);
    }
}
