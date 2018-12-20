package com.jason.designPatterns.iterator.combination;

import java.util.Iterator;

/**
 * 菜单项
 * 
 * @author liuwch
 * @creation 2018-8-15
 */
public class MenuItem extends MenuComponent{
	boolean vegetarian;
	double price;

	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	public Iterator creatIterator(){
		return new NullIterator();
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("  MENUITEM:");
		sb.append(this.getName());
		sb.append(" price:");
		sb.append(this.getPrice());
		sb.append(" vegetarian:");
		sb.append(this.isVegetarian());
		sb.append(" describe:");
		sb.append(this.getDescription());
		sb.append("");
		return sb.toString();
	}
	@Override
	public void print() {
		System.out.println(toString());
	}

}
