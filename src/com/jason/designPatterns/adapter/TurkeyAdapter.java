package com.jason.designPatterns.adapter;

import com.jason.designPatterns.adapter.duck.Duck;
import com.jason.designPatterns.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
