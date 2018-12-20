package com.jason.designPatterns.observe.observer;

import java.util.Observable;
import java.util.Observer;

import com.jason.designPatterns.observe.observable.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private float currentTemperature;
	private float lastTemperature;
	private String msg;
	private int times = 0;

	public ForecastDisplay(Observable weatherData) {
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
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			float temp = weatherData.getTemperature();
			if(times > 0){
				lastTemperature = currentTemperature;
				if(temp > lastTemperature){
					msg = "temperature improved";
				}else if(temp < lastTemperature){
					msg = "temperature cooling";
				}else if(temp == lastTemperature){
					msg = "same temperature";
				}
			} else{
				msg = "first temperature";
			}
			this.currentTemperature = temp;
			display();
		}
	}
	@Override
	public void display() {
		times++;
		System.out.println(times + " Forecast: " + msg);
	}

}
