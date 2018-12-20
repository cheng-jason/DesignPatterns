package com.jason.designPatterns.command.example;

public class Invoker {
	private Command cmd = null;

	public void setCommand(Command cmd) {
		this.cmd = cmd;
	}

	public void doIt() {
		if(cmd!=null){
			cmd.excute();
		}
	}
}
