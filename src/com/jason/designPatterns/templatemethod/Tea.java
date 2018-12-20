package com.jason.designPatterns.templatemethod;

public class Tea extends CaffeineBeverage {
	/**
	 * 浸泡茶叶
	 */
	public void brew() {
		System.out.println("Steeping the tea");
	}

	/**
	 * 添加柠檬
	 */
	public void addCondiments() {
		System.out.println("Add Lemon");
	}
	
}
