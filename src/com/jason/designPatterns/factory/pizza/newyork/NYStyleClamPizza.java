package com.jason.designPatterns.factory.pizza.newyork;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.ClamPizza;

public class NYStyleClamPizza extends ClamPizza {
	public NYStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "NYStyleClamPizza";
	}
}
