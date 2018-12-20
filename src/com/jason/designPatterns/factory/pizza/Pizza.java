package com.jason.designPatterns.factory.pizza;

import java.util.ArrayList;

import com.jason.designPatterns.factory.ingredient.Cheese;
import com.jason.designPatterns.factory.ingredient.Clam;
import com.jason.designPatterns.factory.ingredient.Dough;
import com.jason.designPatterns.factory.ingredient.Pepperoni;
import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.ingredient.Sauce;
import com.jason.designPatterns.factory.ingredient.Veggies;

public abstract class Pizza {
	protected String name;
	Dough dough;//面团
	Sauce sauce;//酱汁
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	public ArrayList<String> toppings = new ArrayList<String>();
	protected PizzaIngredientFactory pizzaIngredientFactory;
	public abstract void prepare() ;

	public void bake() {
		System.out.println("Bake for 25 minites at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place the pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
