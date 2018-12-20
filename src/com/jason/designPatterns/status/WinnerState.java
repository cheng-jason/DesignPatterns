package com.jason.designPatterns.status;


@SuppressWarnings("serial")
public class WinnerState implements State {
	transient GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait,we are already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry  ,you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice does not get you another quarter ");
	}

	@Override
	/**
	 *发放两颗糖
	 */
	public void dispense() {
		System.out.println("You are winner,you get two gumballs for your quarter");
		try {
			if (gumballMachine.getCount() > 1) {
				gumballMachine.releaseBall();
				gumballMachine.releaseBall();
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Opps ,out of gumballs");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" winner ");
		return sb.toString();
	}

}
