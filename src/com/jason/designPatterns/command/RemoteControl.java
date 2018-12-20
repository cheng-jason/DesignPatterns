package com.jason.designPatterns.command;

import java.util.Stack;

import com.jason.designPatterns.command.cmd.Command;
import com.jason.designPatterns.command.cmd.NoCommand;

/**
 * 遥控器，有n个插槽
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class RemoteControl {
	int size = 7;// 插槽个数默认7
	Command[] ons = new Command[size];// 控制打开命令
	Command[] offs = new Command[size];// 控制关闭命令
	Stack<Command> undos = new Stack<Command>();// 堆栈实现多此撤销命令

	public RemoteControl() {
		initCmd();
	}

	public RemoteControl(int si) {
		size = si;
		initCmd();
	}

	public void setCommand(int slot, Command oncmd, Command offcmd) {
		// 位置符合范围
		if (slot < size) {
			ons[slot] = oncmd;
			offs[slot] = offcmd;
		} else {
			System.out.println("slot超出范围");
		}
	}

	/**
	 * 打开按钮被按下
	 */
	public void onButtonWasPressed(int slot) {
		if (slot >= size) {
			System.out.println("位置超出范围");
		} else {
			undos.push(ons[slot]);
			ons[slot].excute();
		}
	}

	/**
	 * 一键打开全部，宏命令Macro
	 */
	public void onButtonAllWasPressed() {
		System.out.println("Macro一键打开全部[");
		for (Command cmd : ons) {
			cmd.excute();
		}
		System.out.println("]");
	}

	/**
	 * 一键关闭全部
	 */
	public void offButtonAllWasPressed() {
		System.out.println("Macro一键关闭全部[");
		for (Command cmd : offs) {
			cmd.excute();
		}
		System.out.println("]");
	}

	/**
	 * 关闭按钮被按下
	 */
	public void offButtonWasPressed(int slot) {
		if (slot >= size) {
			System.out.println("位置超出范围");
		} else {
			undos.push(offs[slot]);
			offs[slot].excute();
		}
	}

	/**
	 * 撤销按钮被按下
	 */
	public void undoButtonWasPressed() {
		if (!undos.isEmpty()) {
			System.out.print("撤销操作：");
			Command undo = undos.peek();
			undo.undo();
			undos.pop();
		} else {
			System.out.println("没有按钮被按下");
		}
	}

	private void initCmd() {
		Command cmd = new NoCommand();
		for (int i = 0; i < size; i++) {
			ons[i] = cmd;
			offs[i] = cmd;
		}
	}
}
