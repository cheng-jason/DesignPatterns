package com.jason.designPatterns.adapter;

import java.util.Random;

import com.jason.designPatterns.adapter.duck.Duck;
import com.jason.designPatterns.adapter.turkey.Turkey;

/**
 * Adapter适配器模式：将一个类的接口转换成另一个接口
 * 
 * @author liuwch
 * @creation 2018-6-29
 */

public class DuckAdapter implements Turkey {
	Duck duck;
	Random random;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		random = new Random();
	}

	public void fly() {
		//平均每五次调用，飞行一下
		if (random.nextInt(5) == 0) {
			duck.fly();
		}
	}

	@Override
	public void gobble() {
		duck.quack();
	}
}
