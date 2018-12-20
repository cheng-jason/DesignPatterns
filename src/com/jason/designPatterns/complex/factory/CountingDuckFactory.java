package com.jason.designPatterns.complex.factory;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.decorator.QuackCounter;
import com.jason.designPatterns.complex.duck.DuckCall;
import com.jason.designPatterns.complex.duck.MallardDuck;
import com.jason.designPatterns.complex.duck.RedheadDuck;
import com.jason.designPatterns.complex.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable creatMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable creatDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable creatRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable creatRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
