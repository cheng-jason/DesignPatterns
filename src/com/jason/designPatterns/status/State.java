package com.jason.designPatterns.status;

import java.io.Serializable;
/**
 * 可序列化
 * @author liuwch
 * @creation 2018-8-22
 */
public interface State extends Serializable{
	/**
	 * 动作 投入25美分
	 */
	public void insertQuarter();

	/**
	 * 动作 退回25美分
	 */
	public void ejectQuarter();

	/**
	 * 动作 转动曲柄
	 */
	public void turnCrank();

	/**
	 * 动作 发放糖果
	 */
	public void dispense();
}
