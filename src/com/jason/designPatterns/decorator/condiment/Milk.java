package com.jason.designPatterns.decorator.condiment;

import com.jason.designPatterns.decorator.Beverage;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ",Milk";
	}

	@Override
	public double cost() {
		return Math.round((0.1d + beverage.cost() + addPrice())*100)/100.0;
	}
}
