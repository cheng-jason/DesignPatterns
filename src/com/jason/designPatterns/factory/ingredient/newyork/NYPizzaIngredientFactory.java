package com.jason.designPatterns.factory.ingredient.newyork;

import com.jason.designPatterns.factory.ingredient.Cheese;
import com.jason.designPatterns.factory.ingredient.Clam;
import com.jason.designPatterns.factory.ingredient.Dough;
import com.jason.designPatterns.factory.ingredient.FreshClam;
import com.jason.designPatterns.factory.ingredient.Garilic;
import com.jason.designPatterns.factory.ingredient.MarinaraSauce;
import com.jason.designPatterns.factory.ingredient.Mushroom;
import com.jason.designPatterns.factory.ingredient.Onion;
import com.jason.designPatterns.factory.ingredient.Pepperoni;
import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.ingredient.RedPepper;
import com.jason.designPatterns.factory.ingredient.ReggianoCheese;
import com.jason.designPatterns.factory.ingredient.Sauce;
import com.jason.designPatterns.factory.ingredient.SlicePepperoni;
import com.jason.designPatterns.factory.ingredient.ThinCrustDough;
import com.jason.designPatterns.factory.ingredient.Veggies;


public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garilic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicePepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClam();
	}
}
