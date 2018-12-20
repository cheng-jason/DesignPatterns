package com.jason.designPatterns.complex;

import com.jason.designPatterns.complex.adapter.GooseAdapter;
import com.jason.designPatterns.complex.combination.Flock;
import com.jason.designPatterns.complex.decorator.QuackCounter;
import com.jason.designPatterns.complex.factory.AbstractDuckFactory;
import com.jason.designPatterns.complex.factory.CountingDuckFactory;
import com.jason.designPatterns.complex.factory.DuckFactory;
import com.jason.designPatterns.complex.goose.Goose;
import com.jason.designPatterns.complex.observe.Quackologist;

/**
 * 适配器 装饰者 组合 迭代器 观察者
 * http://wickedlysmart.com/headfirstdesignpatterns/media.html
 * @author liuwch
 * @creation 2018-8-27
 */
public class ComplexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComplexTest complexTest = new ComplexTest();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		complexTest.simulate(duckFactory);
		
		AbstractDuckFactory duckFactory2 = new DuckFactory();
		complexTest.simulate(duckFactory2);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		//抽象工厂+装饰者
		Quackable mallardDuck = duckFactory.creatMallardDuck();
		Quackable duckCall = duckFactory.creatDuckCall();
		Quackable redheadDuck = duckFactory.creatRedheadDuck();
		Quackable rubberDuck = duckFactory.creatRubberDuck();
		//适配
		Goose goose = new Goose();
		Quackable gooseAdapter = new GooseAdapter(goose);

		//组合+迭代器
		Flock flock = new Flock();
		flock.add(mallardDuck);
		flock.add(duckCall);
		flock.add(redheadDuck);
		flock.add(rubberDuck);
		flock.add(gooseAdapter);

		Flock flockTwo = new Flock();
		flockTwo.add(flock);
		flockTwo.add(rubberDuck);
		flockTwo.add(gooseAdapter);
		
		//观察者
		Quackologist quackologist = new Quackologist();
		flockTwo.registerObserver(quackologist);
		simulate(flockTwo);
		System.out.println("duck quacked " + QuackCounter.getCount() + " times");
	}

	void simulate(Quackable flock) {
		flock.quack();
	}
}
