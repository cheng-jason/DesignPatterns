package com.jason.designPatterns.status;

@SuppressWarnings("serial")
public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You have not inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned,but there is no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed,You need to insert quarter");
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" wait for quarter ");
		return sb.toString();
	}

}
