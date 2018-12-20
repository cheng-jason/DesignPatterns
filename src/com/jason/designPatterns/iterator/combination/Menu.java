package com.jason.designPatterns.iterator.combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单
 * 
 * @author liuwch
 * @creation 2018-8-15
 */
public class Menu extends MenuComponent {
	List<MenuComponent> subMenus = new ArrayList<MenuComponent>();

	public Menu(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	@Override
	public MenuComponent getChild(int i) {
		if (subMenus.size() <= i) {
			return null;
		}
		return subMenus.get(i);
	}

	public Iterator creatIterator() {
		return new CompositeIterator(subMenus.iterator());
	}

	@Override
	public void add(MenuComponent mc) {
		subMenus.add(mc);
	}

	@Override
	public void remove(MenuComponent mc) {
		subMenus.remove(mc);
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getName());
		sb.append(" :");
		sb.append(this.getDescription());
		System.out.println(sb.toString());
		//CompositeIterator it = (CompositeIterator) creatIterator();
		Iterator it = subMenus.iterator();
		while (it.hasNext()) {
			MenuComponent mc = (MenuComponent) it.next();
			System.out.print("  ");
			mc.print();
		}
	}

}
