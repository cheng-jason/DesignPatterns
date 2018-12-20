package com.jason.designPatterns.complex.factory;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.duck.DuckCall;
import com.jason.designPatterns.complex.duck.MallardDuck;
import com.jason.designPatterns.complex.duck.RedheadDuck;
import com.jason.designPatterns.complex.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable creatMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable creatDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable creatRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable creatRubberDuck() {
		return new RubberDuck();
	}

}
