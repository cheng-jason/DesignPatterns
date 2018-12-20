package com.jason.designPatterns.adapter.turkey;

public class WildTurkey implements Turkey{
	public void gobble(){
		System.out.println("Turkey gobble");
	}
	public void fly(){
		System.out.println("I am flying a short distance");
	}
}
