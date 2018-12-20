package com.jason.designPatterns.status;

@SuppressWarnings("serial")
public class SoldOutState implements State {
	transient GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out
				.println("You can not insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out
				.println("You can not eject quarter, you have not inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned,but there are no gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed,gumball sold out");
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" sold out ");
		return sb.toString();
	}

}
