package com.jason.designPatterns.decorator.condiment;

import com.jason.designPatterns.decorator.Beverage;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Whip";
	}

	@Override
	public double cost() {
		return Math.round((0.1d + beverage.cost() + addPrice())*100)/100.0;
	}
}
