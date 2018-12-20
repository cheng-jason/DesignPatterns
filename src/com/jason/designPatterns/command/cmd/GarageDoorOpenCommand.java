package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.door.GarageDoor;

/**
 * 车库门打开
 * @author liuwch
 * @creation 2018-6-20
 */
public class GarageDoorOpenCommand implements Command {
	GarageDoor door;

	public GarageDoorOpenCommand(GarageDoor lig) {
		door = lig;
	}

	@Override
	public void excute() {
		door.up();
	}

	@Override
	public void undo() {
		door.down();
	}

}
