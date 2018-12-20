package com.jason.designPatterns.strategy.fly;

public class FlyWithPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am fly with a rocket!");

	}

}
