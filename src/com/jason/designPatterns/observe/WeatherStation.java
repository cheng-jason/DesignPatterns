package com.jason.designPatterns.observe;

import com.jason.designPatterns.observe.observable.WeatherData;
import com.jason.designPatterns.observe.observer.CurrentConditionsDisplay;
import com.jason.designPatterns.observe.observer.ForecastDisplay;
import com.jason.designPatterns.observe.observer.StatisticsDisplay;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);
		StatisticsDisplay sd2 = new StatisticsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(12f, 3f, 44.2f);

		ccd.cancelObserver();
		sd2.cancelObserver();

		weatherData.setMeasurements(11f, 78f, 13.1f);

		ccd.resisterObserver();

		weatherData.setMeasurements(42f, 22f, 41.1f);

		sd2.resisterObserver();
		weatherData.setMeasurements(32f, 41f, 65f);
		
	}

}
