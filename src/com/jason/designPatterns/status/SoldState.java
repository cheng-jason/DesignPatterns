package com.jason.designPatterns.status;


@SuppressWarnings("serial")
public class SoldState implements State {
	transient GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
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
	public void dispense() {
		try {
			if (gumballMachine.getCount() > 0) {
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
		sb.append(" sold ");
		return sb.toString();
	}

}
