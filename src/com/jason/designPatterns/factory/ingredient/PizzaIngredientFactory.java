package com.jason.designPatterns.factory.ingredient;


/**
 * 抽象工厂：提供一个接口，用于创建相关与依赖的对象的家族，而不需要明确指定具体类
 * 原料工厂
 * 
 * @author liuwch
 * @creation 2018-5-4
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();
}
