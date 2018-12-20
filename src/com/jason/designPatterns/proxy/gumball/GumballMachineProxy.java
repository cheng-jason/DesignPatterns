package com.jason.designPatterns.proxy.gumball;

import java.rmi.RemoteException;

import com.jason.designPatterns.status.State;

/**
 * 糖果机监控
 * 
 * @author liuwch
 * @creation 2018-8-22
 */
public class GumballMachineProxy implements GumballMachineRemote {
	// GumballMachineRemote依赖Remote接口
	GumballMachineRemote gumballMachine = null;

	public GumballMachineProxy(GumballMachineRemote gum) {
		setGumballMachineRemote(gum);
	}

	public void setGumballMachineRemote(GumballMachineRemote gum) {
		gumballMachine = gum;
	}

	public void report() throws RemoteException {
		System.out.println("GumballMachine : ");
		System.out.println("  [");
		System.out.println("  Location : " + getLocation());
		System.out.println("  Current inventory : " + getCount());
		System.out.println("  Current state : " + getState());
		System.out.println("  ]");
	}

	@Override
	public State getState() throws RemoteException {
		return gumballMachine.getState();
	}

	@Override
	public String getLocation() throws RemoteException {
		return gumballMachine.getLocation();
	}

	@Override
	public int getCount() throws RemoteException {
		return gumballMachine.getCount();
	}
}
