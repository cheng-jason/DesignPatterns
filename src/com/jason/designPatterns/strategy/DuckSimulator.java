package com.jason.designPatterns.strategy;

import com.jason.designPatterns.strategy.childDuck.MallardDuck;
import com.jason.designPatterns.strategy.childDuck.ModelDuck;
import com.jason.designPatterns.strategy.fly.FlyWithPowered;

public class DuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyWithPowered());
		modelDuck.performFly();
	}

}
