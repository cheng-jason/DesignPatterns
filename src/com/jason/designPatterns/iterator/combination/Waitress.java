package com.jason.designPatterns.iterator.combination;


/**
 * 组合+迭代器模式
 * 
 * @author liuwch
 * @creation 2018-8-15
 */
public class Waitress {
	MenuComponent menus;

	public Waitress(MenuComponent menuComponent) {
		this.menus = menuComponent;
	}

	public void printMenu() {
		System.out.println("Waitress Print menu :");
		System.out.println("【");
		menus.print();
		System.out.println("】");
	}
}
