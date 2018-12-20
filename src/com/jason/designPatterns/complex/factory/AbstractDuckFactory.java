package com.jason.designPatterns.complex.factory;

import com.jason.designPatterns.complex.Quackable;

/**
 * 抽象工厂
 * @author liuwch
 * @creation 2018-8-28
 */
public abstract class AbstractDuckFactory {
public abstract Quackable creatMallardDuck();
public abstract Quackable creatDuckCall();
public abstract Quackable creatRedheadDuck();
public abstract Quackable creatRubberDuck();
}
