package com.jason.designPatterns.decorator;
/**
 *use Decorator Pattern  装饰者模式
 * @author liuwch
 * @creation 2018-6-11
 */
public abstract class Beverage {
	public String description = "Unknown Beverage";
	public String size;
	public static final String TALL = "tall";
	public static final String GRANDE = "grande";
	public static final String VENTI = "venti";
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
