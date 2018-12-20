package com.jason.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 * 
 * @author liuwch
 * @creation 2018-7-6
 */
public class Waitress {
	//支持菜单扩展
	List<Menu> menus;

	public Waitress(Menu pancakeHouseMenu) {
		menus = new ArrayList<Menu>();
		menus.add(pancakeHouseMenu);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	@SuppressWarnings("rawtypes")
	public void printMenu() {
		System.out.println("Print menu :【");
		for (Menu menu : menus) {
			System.out.println("LAUCH");
			Iterator menuIterator = menu.createIterator();
			printMenu(menuIterator);
		}
		System.out.println("】");
	}

	@SuppressWarnings("rawtypes")
	private void printMenu(Iterator iterator) {
		StringBuffer sb = new StringBuffer();
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			sb.append("[name:");
			sb.append(menuItem.getName());
			sb.append(" price:");
			sb.append(menuItem.getPrice());
			sb.append(" describe:");
			sb.append(menuItem.getDesc());
			sb.append("]\n");
		}
		System.out.println(sb.toString());
	}
}
