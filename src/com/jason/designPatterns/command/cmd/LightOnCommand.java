package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.light.Light;

/**
 * 控制灯亮
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light lig) {
		light = lig;
	}

	@Override
	public void excute() {
		light.on();
	}

	@Override
	public void undo() {
		if (light.isOpen())
			light.off();
	}

}
