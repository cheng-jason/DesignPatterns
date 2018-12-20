package com.jason.designPatterns.decorator.base;

import com.jason.designPatterns.decorator.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}
	
	@Override
	public double cost() {
		return 1.05d;
	}

}
