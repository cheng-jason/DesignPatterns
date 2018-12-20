package com.jason.designPatterns.factory.pizza.chicago;

import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.PepperoniPizza;

public class ChicagoStylePepperoniPizza extends PepperoniPizza  {
	public ChicagoStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
		name = "ChicagoStylePepperoniPizza";
	}
}
