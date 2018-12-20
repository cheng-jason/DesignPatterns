package com.jason.designPatterns.observe.observable;

import java.util.Observer;


public interface IObservable {
	public void notifyObservers();
	public void deleteObserver(Observer o);
	public void addObserver(Observer o);
	public void notifyObserver(Object arg);
	public void setChanged();
	public void clearChanged();
}
