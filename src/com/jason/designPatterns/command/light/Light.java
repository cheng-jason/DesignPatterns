package com.jason.designPatterns.command.light;

/**
 * 灯 设备门灯
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class Light {
	boolean on = false;
	String location;

	public Light() {
		location = "Outdoor";
	}

	public Light(String loc) {
		location = loc;
	}
	public void on() {
		on = true;
		System.out.println(location+" Light on");
	}

	public void off() {
		on = false;
		System.out.println(location+" Light off");
	}

	public boolean isOpen() {
		return on;
	}
	public void getStatus() {
		System.out.println(location + " Light is " + (on ? "on" : "off"));
	}

}
