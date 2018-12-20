package com.jason.designPatterns.iterator.combination;

public class CombinationIteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PancakeHouseMenu","Breakfast");
		MenuComponent dinerMenu = new Menu("DinerMenu","Lunch");
		MenuComponent cafeMenu = new Menu("CafeMenu","Dinner");
		MenuComponent dessertMenu = new Menu("DessertMenu","Dessert of course");
		
		dessertMenu.add(new MenuItem("Double skin milk",
				"Milk with double skin", false, 2.99));
		
		// 蔬菜汉堡和炸薯条
		cafeMenu.add(new MenuItem(
				"Veggie Burger and Air Fries",
				"Veggie Burger on a whole wheat bun, lettuce tomato, and fires",
				true, 3.99));
		cafeMenu.add(new MenuItem("Soup of a day",
				"A cup of soup of the day,with a side salad ", false, 3.69));
		
		MenuComponent allMenu = new Menu("AllMenu","All menu combined");
		allMenu.add(pancakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);
		allMenu.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
	}

}
