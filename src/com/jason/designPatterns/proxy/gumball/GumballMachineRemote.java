package com.jason.designPatterns.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.jason.designPatterns.status.State;

/**
 * 代理模式 口香糖贩卖机代理
 * @author liuwch
 * @creation 2018-8-22
 */
public interface GumballMachineRemote  extends Remote {
	
	public State getState() throws RemoteException;

	public String getLocation() throws RemoteException;

	public int getCount() throws RemoteException;
}
