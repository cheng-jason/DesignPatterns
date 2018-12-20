package com.jason.designPatterns.proxy.gumball;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * 糖果机监控
 * 
 * @author liuwch
 * @creation 2018-8-22
 */
public class GumballMonitor {
	// GumballMachineRemote依赖Remote接口
	List<GumballMachineRemote> gumballMachines = new ArrayList<GumballMachineRemote>();

	public GumballMonitor(GumballMachineRemote gum) {
		addGumballMachineRemote(gum);
	}

	public void addGumballMachineRemote(GumballMachineRemote gum) {
		gumballMachines.add(gum);
	}

	public void report() throws RemoteException {
		int index = 1;
		for (GumballMachineRemote gumballMachine : gumballMachines) {
			System.out.println("GumballMachine " + index + " : ");
			System.out.println("  [");
			System.out.println("  Location : " + gumballMachine.getLocation());
			System.out.println("  Current inventory : "
					+ gumballMachine.getCount());
			System.out
					.println("  Current state : " + gumballMachine.getState());
			System.out.println("  ]");
			index++;
		}
	}
}
