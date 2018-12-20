package com.jason.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 煎饼屋菜单
 * 
 * @author liuwch
 * @creation 2018-7-4
 */
public class PancakeHouseMenu implements Menu{
	List<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		// 清蛋 吐司
		addMenuItem("K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs and toast", true, 2.99);
		// 煎蛋香肠
		addMenuItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs and sausage", false, 2.99);
		// 蓝莓
		addMenuItem("Blueberry Pancakes", "Pancakes with fresh blueberries ",
				true, 3.49);
		// 松饼，可选蓝莓或草莓
		addMenuItem("Waffles",
				"Waffles,with your choice of blueberries or strawberries ",
				true, 3.59);
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
		sb.append(" PancakeHouseMenu: \n");
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
