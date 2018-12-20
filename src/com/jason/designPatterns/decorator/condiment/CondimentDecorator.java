package com.jason.designPatterns.decorator.condiment;

import com.jason.designPatterns.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	@Override
	public abstract String getDescription();

	public double addPrice(){
		double cost = 0d;
		if (TALL.equals(beverage.getSize())) {
			cost = 0.1d;
		} else if (GRANDE.equals(beverage.getSize())) {
			cost = 0.15d;
		} else if (VENTI.equals(beverage.getSize())) {
			cost = 0.2d;
		}
		return cost;
	}
}
