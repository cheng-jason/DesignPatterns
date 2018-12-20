package com.jason.designPatterns.factory.pizza.chicago;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza {
	
	public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "ChicagoStyleCheesePizza";
	}
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	@Override
	public void prepare() {
		
	}
}
