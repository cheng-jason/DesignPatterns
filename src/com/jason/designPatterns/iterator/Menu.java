package com.jason.designPatterns.iterator;

import java.util.Iterator;

public interface Menu {
	@SuppressWarnings("rawtypes")
	public Iterator createIterator();
}
