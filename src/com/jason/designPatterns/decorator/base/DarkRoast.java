package com.jason.designPatterns.decorator.base;

import com.jason.designPatterns.decorator.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	public double cost() {
		return 0.99d;
	}

}
