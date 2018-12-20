package com.jason.designPatterns.complex.observe;

/**
 * 观察者模式
 * @author liuwch
 * @creation 2018-8-29
 */
public interface QuackObservable {
	public void registerObserver(Observer ob);

	public void notifyObserver();
}
