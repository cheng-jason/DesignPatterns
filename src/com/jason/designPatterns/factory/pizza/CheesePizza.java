package com.jason.designPatterns.factory.pizza;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	protected PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
		name = "CheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		
	}
}
