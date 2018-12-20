package com.jason.designPatterns.templatemethod;

/**
 * 鸭子大小比较
 * 
 * @author liuwch
 * @creation 2018-6-29
 */
public class DuckCompare implements Comparable {
	String name;// 名称
	int weight;// 尺寸

	public DuckCompare(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		DuckCompare otherduck = (DuckCompare) o;
		//从小到大排序 
		//return this.weight - otherduck.weight;
		//从大到小排序 
		return otherduck.weight - this.weight;
		// if (this.weight > otherduck.weight) {
		// return 1;
		// } else if (this.weight == otherduck.weight) {
		// return 0;
		// } else {
		// return -1;
		// }
	}

	public String toString() {
		return this.name + ":" + this.weight;
	}
}
