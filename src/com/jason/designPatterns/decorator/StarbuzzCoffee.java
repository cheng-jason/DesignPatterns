package com.jason.designPatterns.decorator;

import com.jason.designPatterns.decorator.base.DarkRoast;
import com.jason.designPatterns.decorator.base.Espresso;
import com.jason.designPatterns.decorator.base.HouseBlend;
import com.jason.designPatterns.decorator.condiment.Mocha;
import com.jason.designPatterns.decorator.condiment.Soy;
import com.jason.designPatterns.decorator.condiment.Whip;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		Beverage beverage3 = new DarkRoast();
//		beverage3.setSize(Beverage.VENTI);
//		beverage3.setSize(Beverage.TALL);
		beverage3.setSize(Beverage.GRANDE);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3 = new Soy(beverage3);
		System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
	}

}
