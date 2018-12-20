package com.jason.designPatterns.status;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import com.jason.designPatterns.proxy.gumball.GumballMachineRemote;

/**
 * 状态模式 口香糖贩卖机 亦用于代理模式服务端使用，远程服务对象扩展UnicastRemoteObject
 * 
 * @author liuwch
 * @creation 2018-8-18
 */
public class GumballMachine extends UnicastRemoteObject implements
		GumballMachineRemote {

	private static final long serialVersionUID = 1L;
	// 状态
	private State soldOutState;// 售罄
	private State noQuarterState;// 无25美分
	private State hasQuarterState;// 有25美分
	private State soldState;// 售出
	private State winnerState;// 中奖了，获得两颗糖

	private State state = soldOutState;// 当前状态已售罄，未初始化
	private int count = 0;// 糖果数量
	private String location;// 机器位置

	public void setState(State state) {
		this.state = state;
	}

	public State getState() throws RemoteException {
		return this.state;
	}

	public String getLocation() throws RemoteException {
		return location;
	}

	public int getCount() throws RemoteException {
		return count;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	/**
	 * RMI网络风险，需要抛出异常
	 * 
	 * @param loc
	 * @param c
	 * @throws RemoteException
	 */
	public GumballMachine(String loc, int c) throws RemoteException {
		count = c;
		location = loc;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		if (count > 0) {
			state = noQuarterState;
		}
	}

	/**
	 * 动作 投入25美分
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}

	/**
	 * 动作 退回25美分
	 */
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	/**
	 * 动作 转动曲柄 发放糖果
	 */
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	/**
	 * 释放糖果
	 */
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot");
		if (count > 0) {
			count--;
		}
	}

	/**
	 * 重新填充糖果
	 */
	public void refill(int c) {
		if (count > 0) {
			count = c;
			setState(noQuarterState);
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("  GumballMachine has ");
		sb.append(this.count);
		sb.append(" gumballs");
		sb.append("\n    location is ");
		sb.append(this.location);
		sb.append("\n    state is ");
		sb.append(this.state);
		return sb.toString();
	}

	public static void main(String[] arg) {
		try {
			GumballMachineRemote gumballMachineRemote = new GumballMachine("山东济南", 1000);
			// 程序启动rmiregistry 默认接口1099
			System.out.println(LocateRegistry.getRegistry());
			if (LocateRegistry.getRegistry() == null) {
				LocateRegistry.createRegistry(1099);
			}
			GumballMachine gm = (GumballMachine) gumballMachineRemote;
			gm.insertQuarter();
			gm.turnCrank();
			gm.turnCrank();
			Naming.rebind("GumballMachine", gumballMachineRemote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
