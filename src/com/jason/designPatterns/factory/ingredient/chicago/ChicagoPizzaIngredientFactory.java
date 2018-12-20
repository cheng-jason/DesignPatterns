package com.jason.designPatterns.factory.ingredient.chicago;

import com.jason.designPatterns.factory.ingredient.BlackOlives;
import com.jason.designPatterns.factory.ingredient.Cheese;
import com.jason.designPatterns.factory.ingredient.Clam;
import com.jason.designPatterns.factory.ingredient.Dough;
import com.jason.designPatterns.factory.ingredient.EggPlant;
import com.jason.designPatterns.factory.ingredient.FrozenClam;
import com.jason.designPatterns.factory.ingredient.Mozzarella;
import com.jason.designPatterns.factory.ingredient.Pepperoni;
import com.jason.designPatterns.factory.ingredient.PizzaIngredientFactory;
import com.jason.designPatterns.factory.ingredient.PlumTomatoSauce;
import com.jason.designPatterns.factory.ingredient.Sauce;
import com.jason.designPatterns.factory.ingredient.SlicePepperoni;
import com.jason.designPatterns.factory.ingredient.Spinach;
import com.jason.designPatterns.factory.ingredient.ThickCrustDough;
import com.jason.designPatterns.factory.ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory  {
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new EggPlant(),new BlackOlives(),new Spinach()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicePepperoni();
	}

	@Override
	public Clam createClam() {
		return new FrozenClam();
	}
}
