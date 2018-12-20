package com.jason.designPatterns.factory.store;

import com.jason.designPatterns.factory.pizza.Pizza;

/**
 * 工厂方法：定义一个创建对象的接口，但是由子类决定要实例的是哪一个。它让类把实例化推迟到子类。
 * @author liuwch
 * @creation 2018-5-14
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = creastPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza creastPizza(String type);

}
