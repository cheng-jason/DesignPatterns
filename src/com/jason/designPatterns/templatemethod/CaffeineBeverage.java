package com.jason.designPatterns.templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 模板方法模式：在一个方法中定义一个算法的骨架，将一些步骤延迟到子类中
 * 咖啡因饮料
 * 
 * @author liuwch
 * @creation 2018-6-29
 */
public abstract class CaffeineBeverage {
	// 子类不能覆盖，模板方法
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
		
	}

	/**
	 * 将水煮沸
	 */
	final void boilWater() {
		System.out.println("Boiling Water");
	}

	/**
	 * 冲泡饮料
	 */
	protected abstract void brew();

	/**
	 * 倒进杯子
	 */
	void pourInCup() {
		System.out.println("Pour into cup");
	}

	/**
	 * 添加调料
	 */
	protected abstract void addCondiments();
	/**
	 *hook钩子，子类自己决定是否覆盖，客户是否需要添加调料
	 */
	boolean customerWantsCondiments() {
		return true;
	}
	
	String getCustomerWant() {
		String answer = null;
		System.out.println("would you like milk and suger with your coffee(y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Throwable e) {
			System.out.println("IO error ");
		}
		if (answer == null) {
			answer = "no";
		}
		return answer;
	}
}
