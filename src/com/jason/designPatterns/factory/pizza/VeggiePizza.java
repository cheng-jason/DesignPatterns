package com.jason.designPatterns.factory.pizza;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	
	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "VeggiePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}
}
