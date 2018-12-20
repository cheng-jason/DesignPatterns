package com.jason.designPatterns.templatemethod;

import java.util.Arrays;

public class TemplateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CaffeineBeverage caf = new Tea();
		caf.prepareRecipe();
		System.out.println("-------------");
		caf = new Coffee();
		caf.prepareRecipe();
		System.out.println("-------------");
		caf = new CoffeeWithHook();
		//caf.prepareRecipe();
		System.out.println("-------------");
		System.out.println("before sorting:");
		DuckCompare[] ducks = { new DuckCompare("Daffy", 8),
				new DuckCompare("Dewey", 2), new DuckCompare("Howard", 7),
				new DuckCompare("Louie", 2), new DuckCompare("Donald", 10),
				new DuckCompare("Huey", 2), };
		display(ducks);
		System.out.println("after sorting:");
		Arrays.sort(ducks);
		display(ducks);
	}

	static void display(DuckCompare[] ducks) {

		for (DuckCompare duckCompare : ducks) {
			System.out.println(duckCompare);
		}
	}

}
