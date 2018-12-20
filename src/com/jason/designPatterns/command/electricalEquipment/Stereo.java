package com.jason.designPatterns.command.electricalEquipment;

/**
 * 音响
 * 
 * @author liuwch
 * @creation 2018-6-21
 */
public class Stereo {

	int volume = 0;// 音量范围0-500
	String carrier = "";// 音乐载体，cd或者dvd
	boolean on = false;

	public void on() {
		on = true;
		System.out.println("Stereo on");
	}

	public void off() {
		on = false;
		System.out.println("Stereo off");
	}

	public void setCd() {
		carrier = "cd";
		System.out.println("Stereo setCd");
	}

	public void setDvd() {
		carrier = "dvd";
		System.out.println("Stereo setDvd");
	}

	public void setVolume(int vo) {
		volume = vo;
		System.out.println("Stereo setVolume:" + vo);
	}

	public int getVolume() {
		return volume;
	}

	public String getCarrier() {
		return carrier;
	}
}
