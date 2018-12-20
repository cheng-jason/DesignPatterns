package com.jason.designPatterns.observe.observable;

import java.util.Observable;
/**
 * Observable 观察者模式
 * @author jason
 *
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
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
