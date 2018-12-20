package com.jason.designPatterns.complex.combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jason.designPatterns.complex.Quackable;
import com.jason.designPatterns.complex.observe.Observer;

/**
 * 组合模式+迭代器模式
 * 
 * @author liuwch
 * @creation 2018-8-27
 */
public class Flock implements Quackable {
	List<Quackable> quacks = new ArrayList<Quackable>();
	public void add(Quackable quack) {
		quacks.add(quack);
	}

	@SuppressWarnings("rawtypes")
	public void quack() {
		Iterator it = quacks.iterator();
		while (it.hasNext()) {
			Quackable quack = (Quackable) it.next();
			quack.quack();
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void registerObserver(Observer ob) {
		Iterator it = quacks.iterator();
		while (it.hasNext()) {
			Quackable quack = (Quackable) it.next();
			quack.registerObserver(ob);
		}
	}

	@Override
	public void notifyObserver() {
	}
}
