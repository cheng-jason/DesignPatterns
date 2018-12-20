package com.jason.designPatterns.command.example;

public class Client {
	public Command createCommandObject() {
		return new OrderCommand();
	}

	public static void main(String[] ars) {
		Client client = new Client();
		Command cmd = client.createCommandObject();
		Invoker invoker = new Invoker();
		invoker.setCommand(cmd);
		invoker.doIt();
	}
}
