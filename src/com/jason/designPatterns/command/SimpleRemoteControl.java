package com.jason.designPatterns.command;

import com.jason.designPatterns.command.cmd.Command;


/**
 *遥控器，有一个命令
 * @author liuwch
 * @creation 2018-6-20
 */
public class SimpleRemoteControl {
	Command slot;//一个命令，控制一个装置操作
	
	public void setCommand(Command cmd) {
		this.slot = cmd;
	}

	/**
	 * 按钮被按下
	 */
	public void buttonWasPressed() {
		if(slot!=null){
			slot.excute();
		}
	}
}
