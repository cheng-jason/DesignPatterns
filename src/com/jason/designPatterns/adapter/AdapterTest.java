package com.jason.designPatterns.adapter;

import com.jason.designPatterns.adapter.duck.Duck;
import com.jason.designPatterns.adapter.duck.MallardDuck;
import com.jason.designPatterns.adapter.turkey.Turkey;
import com.jason.designPatterns.adapter.turkey.WildTurkey;

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Turkey wildTurkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
		testDuck(mallardDuck);
		testDuck(turkeyAdapter);
		
		DuckAdapter duckAdapter = new DuckAdapter(mallardDuck);
		testTurkey(wildTurkey);
		testTurkey(duckAdapter);
	}

	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}

}
