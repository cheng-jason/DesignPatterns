package com.jason.designPatterns.complex.duck;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.observe.Observable;
import com.jason.designPatterns.complex.observe.Observer;

public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("DuckCall Kwak!");
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer ob) {
		observable.registerObserver(ob);
	}

	@Override
	public void notifyObserver() {
		observable.notifyObserver();
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("DuckCall");
		return sb.toString();
	}

}
