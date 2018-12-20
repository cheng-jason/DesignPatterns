package com.jason.designPatterns.factory.pizza.chicago;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.ClamPizza;

public class ChicagoStyleClamPizza extends ClamPizza {
	public ChicagoStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "ChicagoStyleClamPizza";
	}
}
