package com.jason.designPatterns.command.electricalEquipment;

/**
 * 吊扇
 * 
 * @author liuwch
 * @creation 2018-6-21
 */
public class CellingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed = 0;

	public void low() {
		speed = LOW;
		System.out.println("CellingFan low");
	}

	public void medium() {
		speed = MEDIUM;
		System.out.println("CellingFan medium");
	}

	public void high() {
		speed = HIGH;
		System.out.println("CellingFan high");
	}

	public void off() {
		speed = OFF;
		System.out.println("CellingFan off");
	}

	public int getSpeed() {
		return speed;
	}
}
