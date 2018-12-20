package com.jason.designPatterns.complex.observe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {

	List<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	public void registerObserver(Observer ob) {
		observers.add(ob);
	}

	@SuppressWarnings("rawtypes")
	public void notifyObserver() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer observer = (Observer) it.next();
			observer.update(duck);
		}
	}

}
