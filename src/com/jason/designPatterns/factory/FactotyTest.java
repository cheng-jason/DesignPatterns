package com.jason.designPatterns.factory;

import java.util.Date;

import com.jason.designPatterns.factory.fac.SimplePizzaFactory;
import com.jason.designPatterns.factory.pizza.Pizza;
import com.jason.designPatterns.factory.store.ChicagoPizzaStore;
import com.jason.designPatterns.factory.store.NewYorkPizzaStore;
import com.jason.designPatterns.factory.store.PizzaStore;

public class FactotyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date date = new Date(1526002019201l);
		System.out.println(date);
		String pizzaType = ConstantUtils.CHEESE;
		PizzaStore nypizzaStore = new NewYorkPizzaStore();
		Pizza pizza = nypizzaStore.orderPizza(pizzaType);
		System.out.println("NewYork cust ordered a" + pizza.getName());
		System.out.println("..................");

		PizzaStore chicagopizzaStore = new ChicagoPizzaStore();
		pizza = chicagopizzaStore.orderPizza(pizzaType);
		System.out.println("Chicago cust ordered a" + pizza.getName());
		System.out.println("..................");
		
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		Pizza pizza2 = simplePizzaFactory.creastPizza(pizzaType);
		pizza2.prepare();
		pizza2.bake();
		pizza2.cut();
		pizza2.box();
		System.out.println("..................");
		
	}

}
