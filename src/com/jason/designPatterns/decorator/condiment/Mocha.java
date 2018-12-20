package com.jason.designPatterns.decorator.condiment;

import com.jason.designPatterns.decorator.Beverage;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		return Math.round((0.2d + beverage.cost() + addPrice())*100)/100.0;
	}
}
