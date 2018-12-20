package com.jason.designPatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
	Enumeration enume;
	
	public EnumerationIterator(Enumeration enume){
		this.enume = enume;
	}
	@Override
	public boolean hasNext() {
		return enume.hasMoreElements();
	}

	@Override
	public Object next() {
		return enume.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
