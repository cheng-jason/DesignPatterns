package com.jason.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 甜品菜单
 * 
 * @author liuwch
 * @creation 2018-7-4
 */
public class DessertMenu implements Menu{
	List<MenuItem> menuItems;
	public DessertMenu() {
		menuItems = new ArrayList<MenuItem>();
		// 油炸甜甜圈
		addMenuItem("Fried doughnut",
				"Doughnut with fried", true, 3.69);
		// 双皮奶
		addMenuItem("Double skin milk",
				"Milk with double skin", false, 2.99);
	}

	public void addMenuItem(String name, String desc, boolean vegetarian,
			double price) {
		MenuItem menu = new MenuItem(name, desc, vegetarian, price);
		menuItems.add(menu);
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return menuItems.iterator();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < menuItems.size(); i++) {
			MenuItem menuItem = menuItems.get(i);
			sb.append("name:");
			sb.append(menuItem.getName());
			sb.append(" price:");
			sb.append(menuItem.getPrice());
			sb.append(" describe:");
			sb.append(menuItem.getDesc());
			sb.append("\n");
		}
		return sb.toString();
	}
}
