package com.jason.designPatterns.complex.decorator;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.observe.Observer;

/**
 * 装饰者
 * 
 * @author liuwch
 * @creation 2018-8-27
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int count = 0;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	public void quack() {
		duck.quack();
		count++;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public void registerObserver(Observer ob) {
		duck.registerObserver(ob);
	}

	@Override
	public void notifyObserver() {
		duck.notifyObserver();
	}
}
