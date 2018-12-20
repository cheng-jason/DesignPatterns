package com.jason.designPatterns.factory.pizza;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	
	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "PepperoniPizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}
}
