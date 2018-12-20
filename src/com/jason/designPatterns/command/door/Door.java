package com.jason.designPatterns.command.door;

/**
 * 门
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class Door {
	String location;

	public Door() {
		location = "parlour";
	}

	public Door(String loc) {
		location = loc;
	}

	public void open() {
		System.out.println("Door is open");
	}

	public void close() {
		System.out.println("Door is close");
	}
}
