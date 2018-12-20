package com.jason.designPatterns.command;

import com.jason.designPatterns.command.cmd.Command;
import com.jason.designPatterns.command.cmd.GarageDoorOpenCommand;
import com.jason.designPatterns.command.cmd.LightOffCommand;
import com.jason.designPatterns.command.cmd.LightOnCommand;
import com.jason.designPatterns.command.door.GarageDoor;
import com.jason.designPatterns.command.light.Light;

public class SimpleRemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("simpleRemoteControl test:[");
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		// 门灯
		Light light = new Light();
		Command command = new LightOnCommand(light);
		simpleRemoteControl.setCommand(command);
		simpleRemoteControl.buttonWasPressed();

		// 顶灯
		light = new Light("Ceiling");
		command = new LightOffCommand(light);
		simpleRemoteControl.setCommand(command);
		simpleRemoteControl.buttonWasPressed();

		// 车库门
		GarageDoor garageDoor = new GarageDoor();
		command = new GarageDoorOpenCommand(garageDoor);
		simpleRemoteControl.setCommand(command);
		simpleRemoteControl.buttonWasPressed();
		System.out.println("]");
		System.out.println();
		System.out.println("RemoteControl test:[");
		// 多个插槽控制器
		RemoteControl remoteControl = new RemoteControl();
		RemoteLoader.initRemoteControl(remoteControl);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.undoButtonWasPressed();
		remoteControl.undoButtonWasPressed();
		
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.onButtonWasPressed(4);
		remoteControl.undoButtonWasPressed();
		remoteControl.undoButtonWasPressed();

		//采用宏命令取代全部执行，因为无撤销
		//remoteControl.onButtonAllWasPressed();
		//remoteControl.offButtonAllWasPressed();
		remoteControl.onButtonWasPressed(6);
		remoteControl.undoButtonWasPressed();
		remoteControl.offButtonWasPressed(6);
		remoteControl.undoButtonWasPressed();
	}

}
