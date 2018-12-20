package com.jason.designPatterns.factory.pizza.newyork;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.PepperoniPizza;

public class NYStylePepperoniPizza extends PepperoniPizza  {
	public NYStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "NYStylePepperoniPizza";
	}
}
