package com.jason.designPatterns.observe.observable;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherDataSelf  extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	private boolean changed = false;
	private ArrayList<Observer> observers;

	public WeatherDataSelf() {
		observers = new ArrayList<Observer>();
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

	@Override
	public void notifyObservers() {
		if(changed){
			for (Observer ob : observers) {
				ob.update(this, null);
			}
			changed= false;
		}
	}

	@Override
	public void deleteObserver(Observer o) {
		if (!observers.contains(o)) {
			System.out.println("You do not resister");
		} else {
			observers.remove(o);
		}
	}

	@Override
	public void addObserver(Observer o) {
		if (!observers.contains(o)) {
			observers.add(o);
		} else {
			System.out.println("You have already resister");
		}
	}
}
