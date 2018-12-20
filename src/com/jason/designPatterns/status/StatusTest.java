package com.jason.designPatterns.status;

import java.rmi.RemoteException;

/**
 * 状态模式
 * 
 * @author liuwch
 * @creation 2018-8-18
 */
public class StatusTest {

	public static void main(String[] arg) throws RemoteException {
		GumballMachine gm = new GumballMachine("济南",5);
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm);
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		gm.turnCrank();
		System.out.println(gm);
	}
}
