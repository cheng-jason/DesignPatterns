package com.jason.designPatterns.factory.pizza.newyork;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.CheesePizza;

public class NYStyleCheesePizza extends CheesePizza {
	public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "NYStyleCheesePizza";
	}
	public void bake() {
		System.out.println("Bake for 35 minites at 300");
	}

}
