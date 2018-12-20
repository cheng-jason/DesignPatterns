package com.jason.designPatterns.strategy.quack;

public class Squeack implements QuackBehavior {
	public void quack() {
		System.out.println("Squeack");
	}
}