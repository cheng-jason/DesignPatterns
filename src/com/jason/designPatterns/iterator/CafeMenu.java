package com.jason.designPatterns.iterator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 咖啡菜单
 * 
 * @author liuwch
 * @creation 2018-7-4
 */
public class CafeMenu implements Menu {
	Map<String, MenuItem> menuItems;

	public CafeMenu() {
		menuItems = new HashMap<String, MenuItem>();
		// 蔬菜汉堡和炸薯条
		addMenuItem(
				"Veggie Burger and Air Fries",
				"Veggie Burger on a whole wheat bun, lettuce tomato, and fires",
				true, 3.99);
		// 例汤
		addMenuItem("Soup of a day",
				"A cup of soup of the day,with a side salad ", false, 3.69);
		// 墨西哥煎饼
		addMenuItem("Burrito",
				"A large burrito, with whole pinto beans,salsa,guacamole ",
				true, 4.29);
	}

	public void addMenuItem(String name, String desc, boolean vegetarian,
			double price) {
		MenuItem menu = new MenuItem(name, desc, vegetarian, price);
		menuItems.put(menu.getName(), menu);
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Collection<MenuItem> menus = (Collection<MenuItem>) menuItems.values();
		sb.append(" CafeMenu: \n");
		for (MenuItem menuItem : menus) {
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
