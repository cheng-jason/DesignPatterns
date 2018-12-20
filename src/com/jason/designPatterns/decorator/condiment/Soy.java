package com.jason.designPatterns.decorator.condiment;

import com.jason.designPatterns.decorator.Beverage;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Soy";
	}

	@Override
	public double cost() {
		return Math.round((0.15d + beverage.cost() + addPrice())*100)/100.0;
	}
}
