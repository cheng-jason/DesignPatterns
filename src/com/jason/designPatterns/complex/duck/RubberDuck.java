package com.jason.designPatterns.complex.duck;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.observe.Observable;
import com.jason.designPatterns.complex.observe.Observer;

public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}

	@Override
	public void registerObserver(Observer ob) {
		observable.registerObserver(ob);
	}

	@Override
	public void notifyObserver() {
		observable.notifyObserver();
	}

	@Override
	public void quack() {
		System.out.println("RubberDuck quack!");
		notifyObserver();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("RubberDuck");
		return sb.toString();
	}
}
