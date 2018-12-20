package com.jason.designPatterns.command.door;

/**
 * 车库门
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class GarageDoor {
	public void up() {
		System.out.println("Garage Door is open");
	}

	public void down() {
		System.out.println("Garage Door is close");
	}
}
