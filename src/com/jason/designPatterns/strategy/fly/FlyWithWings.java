package com.jason.designPatterns.strategy.fly;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying!");
	}

}
