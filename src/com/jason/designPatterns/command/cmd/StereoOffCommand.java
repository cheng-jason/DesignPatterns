package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.electricalEquipment.Stereo;

/**
 * 音响关闭
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class StereoOffCommand implements Command {
	Stereo stereo;
	int volume = 0;// 音量范围0-500
	String carrier = "";// 音乐载体，cd或者dvd

	public StereoOffCommand(Stereo ste) {
		stereo = ste;
	}

	@Override
	public void excute() {
		volume = stereo.getVolume();
		carrier = stereo.getCarrier();
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		if ("cd".equals(carrier)) {
			stereo.setCd();
		} else if ("dvd".equals(carrier)) {
			stereo.setDvd();
		}
		stereo.setVolume(volume);
	}

}
