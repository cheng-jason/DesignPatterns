package com.jason.designPatterns.command.example;

public class OrderCommand implements Command{
	Reciever reciever = new Reciever();
	public void excute(){
		reciever.action1();
		reciever.action2();
	}
}
