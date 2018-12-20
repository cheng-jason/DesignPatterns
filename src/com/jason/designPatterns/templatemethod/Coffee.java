package com.jason.designPatterns.templatemethod;

public class Coffee extends CaffeineBeverage {
	/**
	 * 冲泡咖啡
	 */
	public void brew() {
		System.out.println("Brew the coffee");
	}

	/**
	 * 添加糖和牛奶
	 */
	public void addCondiments() {
		System.out.println("Add suger and milk");
	}
}
