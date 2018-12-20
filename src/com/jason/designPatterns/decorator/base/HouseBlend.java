package com.jason.designPatterns.decorator.base;

import com.jason.designPatterns.decorator.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	@Override
	public double cost() {
		return 0.89d;
	}
}
