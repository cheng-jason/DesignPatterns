package com.jason.designPatterns.command.cmd;
/**
 *use Command Pattern  命令模式
 * @author liuwch
 * @creation 2018-6-20
 */
public interface Command {
	/**
	 * 执行命令
	 */
	public void excute();
	/**
	 * 撤销命令
	 */
	public void undo();
}
