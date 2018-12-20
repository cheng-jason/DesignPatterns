package com.jason.designPatterns.complex;

import com.jason.designPatterns.complex.observe.QuackObservable;

public interface Quackable extends QuackObservable{
	public void quack();
}
