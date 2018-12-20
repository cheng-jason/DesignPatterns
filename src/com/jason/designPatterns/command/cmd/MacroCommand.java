package com.jason.designPatterns.command.cmd;

/**
 * 宏命令，一组命令
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class MacroCommand implements Command {
	Command[] cmds;

	public MacroCommand(Command[] cmds) {
		this.cmds = cmds;
	}

	@Override
	public void excute() {
		System.out.println("Macro宏命令[");
		for (Command cmd : cmds) {
			cmd.excute();
		}
		System.out.println("]");
	}

	@Override
	public void undo() {
		System.out.println("Macro宏命令撤销[");
		for (Command cmd : cmds) {
			cmd.undo();
		}
		System.out.println("]");
	}

}
