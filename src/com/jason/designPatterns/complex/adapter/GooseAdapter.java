package com.jason.designPatterns.complex.adapter;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.goose.Goose;
import com.jason.designPatterns.complex.observe.Observer;

/**
 * 适配器
 * 
 * @author liuwch
 * @creation 2018-8-27
 */
public class GooseAdapter implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void registerObserver(Observer ob) {
		System.out.println("GooseAdapter has not registerObserver");
	}

	@Override
	public void notifyObserver() {
		System.out.println("GooseAdapter has not notifyObserver");
	}

	@Override
	public void quack() {
		goose.honk();
		notifyObserver();
	}
}
