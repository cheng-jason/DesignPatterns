package com.jason.designPatterns.strategy;

import com.jason.designPatterns.strategy.quack.QuackBehavior;

public class DuckCall {
	protected QuackBehavior quackBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
