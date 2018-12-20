package com.jason.designPatterns.factory.pizza.newyork;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.VeggiePizza;

public class NYStyleVeggiePizza extends VeggiePizza {
	public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "NYStyleVeggiePizza";
	}
}
