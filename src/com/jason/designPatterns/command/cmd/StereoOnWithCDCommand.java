package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.electricalEquipment.Stereo;

/**
 * 音响存放CD并打开
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo ste) {
		stereo = ste;
	}

	@Override
	public void excute() {
		stereo.setCd();
		stereo.on();
		stereo.setVolume(16);
	}

	@Override
	public void undo() {
		System.out.println("StereoOnWithCDCommand undo");
	}

}
