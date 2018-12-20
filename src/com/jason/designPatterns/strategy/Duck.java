package com.jason.designPatterns.strategy;

import com.jason.designPatterns.strategy.fly.FlyBehavior;
import com.jason.designPatterns.strategy.quack.QuackBehavior;
/**
 * use Strategy Pattern 策略模式
 * @author jason
 *
 */
public abstract class Duck {
	//算法族
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	public void swim() {
		System.out.println("All ducks float,even decoys!");
	}

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}
 
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
 
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
