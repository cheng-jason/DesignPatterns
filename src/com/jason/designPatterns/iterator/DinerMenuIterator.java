package com.jason.designPatterns.iterator;

import java.util.Iterator;

/**
 * 餐厅菜单迭代器
 * 
 * @author liuwch
 * @creation 2018-7-4
 */
@SuppressWarnings("rawtypes")
public class DinerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	DessertMenu dessertMenu;
	Iterator iterator;
	int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems,DessertMenu dessertMenu) {
		this.menuItems = menuItems;
		this.dessertMenu = dessertMenu;
		iterator = dessertMenu.createIterator();
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
			if (iterator.hasNext()) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = null;
		if (position >= menuItems.length || menuItems[position] == null) {
			menuItem = (MenuItem) iterator.next();
		} else {
			menuItem = menuItems[position];
			position++;
		}
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException(
					"You can not remove an item util you  have done at least one next()");
		}
		
		if(menuItems[position] !=null){
			//后边元素向前移动一个位置
			for (int i = position-1; i < menuItems.length-1; i++) {
				menuItems[i] = menuItems[i+1];
			}
			menuItems[menuItems.length-1] = null;
		}
	}
}
