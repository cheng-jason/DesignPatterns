package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.electricalEquipment.CellingFan;

/**
 * 高档打开吊扇
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class CellingFanHighCommand implements Command {
	CellingFan cellingFan;
	int prespeed;

	public CellingFanHighCommand(CellingFan ste) {
		cellingFan = ste;
	}

	@Override
	public void excute() {
		prespeed = cellingFan.getSpeed();
		cellingFan.high();
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
