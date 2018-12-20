package com.jason.designPatterns.strategy.childDuck;

import com.jason.designPatterns.strategy.Duck;
import com.jason.designPatterns.strategy.fly.FlyWithWings;
import com.jason.designPatterns.strategy.quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard duck!");
	}
	
}
