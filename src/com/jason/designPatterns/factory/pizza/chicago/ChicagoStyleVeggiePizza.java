package com.jason.designPatterns.factory.pizza.chicago;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.VeggiePizza;

public class ChicagoStyleVeggiePizza extends VeggiePizza {
	public ChicagoStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "ChicagoStyleVeggiePizza";
	}
}
