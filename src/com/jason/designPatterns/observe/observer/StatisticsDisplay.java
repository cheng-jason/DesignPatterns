package com.jason.designPatterns.observe.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import com.jason.designPatterns.observe.observable.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private Observable weatherData;
	private ArrayList<Float> temperatures;
	private float max;
	private float min;
	private float avg;
	private int times = 0;

	public StatisticsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		temperatures = new ArrayList<Float>();
		resisterObserver();
	}

	public void cancelObserver() {
		weatherData.deleteObserver(this);
	}

	public void resisterObserver() {
		weatherData.addObserver(this);
	}

	public void calAvgMaxMIn() {
		if (temperatures.size() > 0) {
			float sum = 0;
			min = temperatures.get(0).floatValue();
			max = temperatures.get(0).floatValue();
			for (Float temp : temperatures) {
				float tempf = temp.floatValue();
				if (tempf > max) {
					max = tempf;
				}
				if (tempf < min) {
					min = tempf;
				}
				sum += tempf;
			}
			avg = sum / temperatures.size();
			avg = (Math.round(avg * 100) / 100.0f);
			// String.format(String.valueOf(avg),"%.2f");
		}
	}

	@Override
	public void display() {
		times++;
		System.out.println(times + " Avg/Max/Min temperature: " + avg + "/"
				+ max + "/" + min);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			float temp = weatherData.getTemperature();
			temperatures.add(temp);
			calAvgMaxMIn();
			display();
		}
	}

}
