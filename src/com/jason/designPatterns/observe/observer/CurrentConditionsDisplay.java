package com.jason.designPatterns.observe.observer;

import java.util.Observable;
import java.util.Observer;

import com.jason.designPatterns.observe.observable.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private float temperature;
	private float humidity;
	private float pressure;
	private int times = 0;

	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		resisterObserver();
	}

	public void cancelObserver() {
		weatherData.deleteObserver(this);
	}

	public void resisterObserver() {
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		times++;
		System.out.println(times + " Current conditions: " + temperature
				+ "F degrees and " + humidity + "%humidity " + pressure + "pressure ");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

}
