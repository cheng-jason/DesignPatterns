package com.jason.designPatterns.command.cmd;


/**
 * 空命令，不执行任何操作
 * @author liuwch
 * @creation 2018-6-20
 */
public class NoCommand implements Command {

	@Override
	public void excute() {
		System.out.println("NoCommand");
	}

	@Override
	public void undo() {
		System.out.println("NoCommand undo");
	}

}
