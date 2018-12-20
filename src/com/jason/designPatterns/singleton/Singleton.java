package com.jason.designPatterns.singleton;

/**
 * 单例模式
 * 
 * @author liuwch
 * @creation 2018-6-11
 */
public class Singleton {
	// 静态变量记录唯一实例
	private static Singleton uniqueInstance;

	/**
	 * 私有化构造函数，只能内部实例化
	 */
	private Singleton() {
	}

	/**
	 * 获取实例
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
