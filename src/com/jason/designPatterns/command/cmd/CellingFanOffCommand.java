package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.electricalEquipment.CellingFan;

/**
 * 关闭吊扇
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class CellingFanOffCommand implements Command {
	CellingFan cellingFan;
	int prespeed;

	public CellingFanOffCommand(CellingFan ste) {
		cellingFan = ste;
	}

	@Override
	public void excute() {
		prespeed = cellingFan.getSpeed();
		cellingFan.off();
	}

	@Override
	public void undo() {
		if (prespeed == CellingFan.HIGH) {
			cellingFan.high();
		} else if (prespeed == CellingFan.MEDIUM) {
			cellingFan.medium();
		} else if (prespeed == CellingFan.LOW) {
			cellingFan.low();
		} else if (prespeed == CellingFan.OFF) {
			cellingFan.off();
		}
	}

}
