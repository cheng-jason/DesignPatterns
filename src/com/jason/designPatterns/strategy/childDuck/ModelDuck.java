package com.jason.designPatterns.strategy.childDuck;

import com.jason.designPatterns.strategy.Duck;
import com.jason.designPatterns.strategy.fly.FlyNoWay;
import com.jason.designPatterns.strategy.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I am a model duck!");
	}

}
