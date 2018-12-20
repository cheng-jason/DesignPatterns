package com.jason.designPatterns.adapter;

import com.jason.designPatterns.adapter.duck.Duck;
import com.jason.designPatterns.adapter.duck.MallardDuck;
import com.jason.designPatterns.adapter.turkey.Turkey;
import com.jason.designPatterns.adapter.turkey.WildTurkey;

/**
 * 外观模式 提供子系统统一接口，例如家庭影院播放，包含灯光，DVD,显示器，音响等操作
 * @author liuwch
 * @creation 2018-6-29
 */
public class Appearance {
	Duck duck;
	Turkey turkey;
	public Appearance(){
		duck = new MallardDuck();
		turkey = new WildTurkey();
	}
	/**
	 * 统一接口
	 */
	public void call(){
		duck.quack();
		turkey.gobble();
	}
}
