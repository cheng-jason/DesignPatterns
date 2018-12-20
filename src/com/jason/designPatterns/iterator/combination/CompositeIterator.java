package com.jason.designPatterns.iterator.combination;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();

	public CompositeIterator(Iterator it) {
		stack.push(it);
	}

	@Override
	public boolean hasNext() {
		if (!stack.isEmpty()) {
			Iterator it = (Iterator) stack.peek();
			if (it.hasNext()) {
				return true;
			} else {
				//迭代
				stack.pop();
				return hasNext();
			}
		}else{
			return false;
		}
		
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator it = (Iterator) stack.peek();
			MenuComponent mc = (MenuComponent) it.next();
			if(mc instanceof Menu){
				stack.push(mc.creatIterator());
			}
			return mc;
		}else{
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
