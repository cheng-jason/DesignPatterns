package com.jason.designPatterns.factory.pizza;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	
	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "ClamPizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		clam = pizzaIngredientFactory.createClam();
	}
}
