package com.jason.designPatterns.factory.store;

import com.jason.designPatterns.factory.ConstantUtils;
import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.ingredient.chicago.ChicagoPizzaIngredientFactory;
import com.jason.designPatterns.factory.pizza.Pizza;
import com.jason.designPatterns.factory.pizza.chicago.ChicagoStyleCheesePizza;
import com.jason.designPatterns.factory.pizza.chicago.ChicagoStyleClamPizza;
import com.jason.designPatterns.factory.pizza.chicago.ChicagoStylePepperoniPizza;
import com.jason.designPatterns.factory.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza creastPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		if (ConstantUtils.CHEESE.equals(type)) {
			pizza = new ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory);
		} else if (ConstantUtils.PEPPERONI.equals(type)) {
			pizza = new ChicagoStylePepperoniPizza(chicagoPizzaIngredientFactory);
		} else if (ConstantUtils.CLAM.equals(type)) {
			pizza = new ChicagoStyleClamPizza(chicagoPizzaIngredientFactory);
		} else if (ConstantUtils.VEGGIE.equals(type)) {
			pizza = new ChicagoStyleVeggiePizza(chicagoPizzaIngredientFactory);
		}
		return pizza;
	}
}
