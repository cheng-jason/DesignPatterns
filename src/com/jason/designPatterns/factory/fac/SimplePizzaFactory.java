package com.jason.designPatterns.factory.fac;

import com.jason.designPatterns.factory.ConstantUtils;
import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.ingredient.newyork.NYPizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.CheesePizza;
import com.jason.designPatterns.factory.pizza.ClamPizza;
import com.jason.designPatterns.factory.pizza.PepperoniPizza;
import com.jason.designPatterns.factory.pizza.Pizza;
import com.jason.designPatterns.factory.pizza.VeggiePizza;

/**
 * 简单工厂：一个实例化类的类
 * @author liuwch
 * @creation 2018-5-14
 */
public class SimplePizzaFactory {
	public Pizza creastPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		if (ConstantUtils.CHEESE.equals(type)) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		} else if (ConstantUtils.PEPPERONI.equals(type)) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
		} else if (ConstantUtils.CLAM.equals(type)) {
			pizza = new ClamPizza(pizzaIngredientFactory);
		} else if (ConstantUtils.VEGGIE.equals(type)) {
			pizza = new VeggiePizza(pizzaIngredientFactory);
		}
		return pizza;
	}
}
