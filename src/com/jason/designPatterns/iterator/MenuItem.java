package com.jason.designPatterns.iterator;

/**
 * 菜单项
 * 
 * @author liuwch
 * @creation 2018-7-4
 */
public class MenuItem {
	String name;
	String desc;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[name:");
		sb.append(this.getName());
		sb.append(" price:");
		sb.append(this.getPrice());
		sb.append(" describe:");
		sb.append(this.getDesc());
		sb.append("]\n");
		return sb.toString();
	}
}
