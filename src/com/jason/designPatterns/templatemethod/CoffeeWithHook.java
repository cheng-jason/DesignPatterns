package com.jason.designPatterns.templatemethod;


public class CoffeeWithHook extends CaffeineBeverage {
	/**
	 * 冲泡咖啡
	 */
	public void brew() {
		System.out.println("Dripping  coffee through filter");
	}

	/**
	 * 添加糖和牛奶
	 */
	public void addCondiments() {
		System.out.println("Adding suger and milk");
	}

	/**
	 * hook钩子，子类自己决定是否覆盖，客户是否需要添加调料
	 */
	boolean customerWantsCondiments() {
		String answer = getCustomerWant();
		if (answer.toUpperCase().startsWith("Y")) {
			return true;
		} else {
			return false;
		}
	}

	
}
