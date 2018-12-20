package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.light.Light;

/**
 * 控制灯灭
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light lig) {
		light = lig;
	}

	@Override
	public void excute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
