package com.jason.designPatterns.command.cmd;

import com.jason.designPatterns.command.door.Door;

/**
 * 门关闭
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class DoorCloseCommand implements Command {
	Door door;

	public DoorCloseCommand(Door lig) {
		door = lig;
	}

	@Override
	public void excute() {
		door.open();
	}

	@Override
	public void undo() {
		door.close();
	}

}
