package com.jason.designPatterns.iterator;

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		System.out.println(pancakeHouseMenu);
		System.out.println("-------------");
		Menu dinerMenu = new DinerMenu();
		System.out.println(dinerMenu);
		System.out.println("-------------");

		Menu cafeMenu = new CafeMenu();
		System.out.println(cafeMenu);
		System.out.println("-------------");

		System.out.println(".........................");
		Waitress waitress = new Waitress(pancakeHouseMenu);
		waitress.addMenu(dinerMenu);
		waitress.addMenu(cafeMenu);
		waitress.printMenu();
	}

}
