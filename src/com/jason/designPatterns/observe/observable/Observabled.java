package com.jason.designPatterns.observe.observable;

import java.util.ArrayList;
import java.util.Observer;

public class Observabled implements IObservable {
	private boolean changed = false;
	private ArrayList<Observer> observers;
	public void notifyObservers() {
		if(changed){
			for (Observer ob : observers) {
				//ob.update((Observable)this, null);
			}
			changed= false;
		}
	}
	public void notifyObserver(Object arg){
		if(changed){
			for (Observer ob : observers) {
				//ob.update((Observable)this, arg);
			}
			changed= false;
		}
	}
	public void deleteObserver(Observer o) {
		if (!observers.contains(o)) {
			System.out.println("You do not resister");
		} else {
			observers.remove(o);
		}
	}

	public void addObserver(Observer o) {
		if (!observers.contains(o)) {
			observers.add(o);
		} else {
			System.out.println("You have already resister");
		}
	}
	
	public void setChanged() {
		changed = true;
	}

	public void clearChanged(){
		changed = false;
	}
}
