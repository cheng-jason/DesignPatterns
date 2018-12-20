package com.jason.designPatterns.iterator.combination;

import java.util.Iterator;


public abstract class MenuComponent {
	String name;
	String desc;
	public abstract void print();
	public abstract Iterator creatIterator();
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return desc;
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public void add(MenuComponent mc) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent mc) {
		throw new UnsupportedOperationException();
	}

}
