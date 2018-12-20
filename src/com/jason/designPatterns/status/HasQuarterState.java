package com.jason.designPatterns.status;

import java.util.Random;

@SuppressWarnings("serial")
public class HasQuarterState implements State {
	Random r = new Random(System.currentTimeMillis());
	//transient告诉JVM不要序列化
	transient GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can not insert another quarter");
	
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned ...");
		int win = r.nextInt(10);
		try {
			//中奖且糖数量满足
			if (win == 0 && gumballMachine.getCount() > 1) {
				gumballMachine.setState(gumballMachine.getWinnerState());
			} else {
				gumballMachine.setState(gumballMachine.getSoldState());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed,You need to turn crank");
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" has a quarter ");
		return sb.toString();
	}

}
