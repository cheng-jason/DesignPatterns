package com.jason.designPatterns.factory.store;

import com.jason.designPatterns.factory.ConstantUtils;
import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.ingredient.newyork.NYPizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.Pizza;
import com.jason.designPatterns.factory.pizza.newyork.NYStyleCheesePizza;
import com.jason.designPatterns.factory.pizza.newyork.NYStyleClamPizza;
import com.jason.designPatterns.factory.pizza.newyork.NYStylePepperoniPizza;
import com.jason.designPatterns.factory.pizza.newyork.NYStyleVeggiePizza;

public class NewYorkPizzaStore extends PizzaStore {

	public Pizza creastPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory nYPizzaIngredientFactory = new NYPizzaIngredientFactory();
		if (ConstantUtils.CHEESE.equals(type)) {
			pizza = new NYStyleCheesePizza(nYPizzaIngredientFactory);
		} else if (ConstantUtils.PEPPERONI.equals(type)) {
			pizza = new NYStylePepperoniPizza(nYPizzaIngredientFactory);
		} else if (ConstantUtils.CLAM.equals(type)) {
			pizza = new NYStyleClamPizza(nYPizzaIngredientFactory);
		} else if (ConstantUtils.VEGGIE.equals(type)) {
			pizza = new NYStyleVeggiePizza(nYPizzaIngredientFactory);
		}
		return pizza;
	}
}
