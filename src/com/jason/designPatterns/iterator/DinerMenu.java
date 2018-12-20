package com.jason.designPatterns.iterator;

import java.util.Iterator;

/**
 * 餐厅菜单
 * 
 * @author liuwch
 * @creation 2018-7-4
 */
public class DinerMenu implements Menu{
	MenuItem[] menuItems;
	//包含子菜单 甜品
	DessertMenu dessertMenu;
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		dessertMenu = new DessertMenu();
		// 素食BLT
		addMenuItem("Vegetarian BLT",
				"(Fakin ) Bacon with lettuce tomato on whole wheat", true, 2.99);
		// BLT 培根、生菜、西红柿
		addMenuItem("BLT", "Bacon with lettuce tomato on whole wheat", false,
				2.99);
		// 例汤
		addMenuItem("Soup of day",
				"Soup of the day,with a side of potato salad ", false, 3.29);
		// 热狗
		addMenuItem("Hotdog",
				"A hot dog,with saurkraut,relish,nions,stopped with cheese ",
				false, 3.05);
	}

	public void addMenuItem(String name, String desc, boolean vegetarian,
			double price) {
		if (numberOfItems >= MAX_ITEMS) {
			System.out
					.println("Sorry menu is full! you can not add item to menu!");
		} else {
			MenuItem menu = new MenuItem(name, desc, vegetarian, price);
			menuItems[numberOfItems] = menu;
			numberOfItems++;
		}

	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems,dessertMenu);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" DinerMenu: \n");
		for (int i = 0; i < menuItems.length; i++) {
			MenuItem menuItem = menuItems[i];
			if (menuItem != null) {
				sb.append("name:");
				sb.append(menuItem.getName());
				sb.append(" price:");
				sb.append(menuItem.getPrice());
				sb.append(" describe:");
				sb.append(menuItem.getDesc());
				sb.append("\n");
			}
		}
		sb.append("   DessertMenu: \n");
		sb.append(dessertMenu.toString());
		return sb.toString();
	}
}
