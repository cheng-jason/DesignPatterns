package com.jason.designPatterns.iterator.combination;

import java.util.Iterator;

public class NullIterator implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
