package com.jason.designPatterns.singleton;

/**
 * 使用单例模式 巧克力锅炉控制器
 * 并发编程的三大概念：原子性，有序性，可见性。
 * @author liuwch
 * @creation 2018-6-11
 */
public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;// 煮沸
	// 静态变量记录唯一实例  volatile关键字来保证共享变量可见性 通过synchronized和Lock也能够保证可见性
	private volatile static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	/**
	 * 获取实例
	 * 双重检查加锁
	 * @return
	 */
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			//同步区块
			synchronized(ChocolateBoiler.class){
				if (uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	/**
	 * 填入原料时，锅炉必须是空的
	 */
	public void fill() {
		if (isEmpty()) {
			empty = true;
			boiled = false;
			// 填入原料（牛奶和巧克力混合物）代码
		}
	}

	/**
	 * 排出时，锅炉必须是满的并且是煮沸的
	 */
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = false;
			boiled = false;
			// 排除煮沸的牛奶和巧克力代码
		}
	}
	
	/**
	 * 煮沸时，锅炉必须是满的并且是未煮沸的
	 */
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 煮沸牛奶和巧克力混合物代码，煮沸后boiled标识变为true
			boiled = true;
		}
	}
}
