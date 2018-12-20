package com.jason.designPatterns.command;

import com.jason.designPatterns.command.cmd.CellingFanHighCommand;
import com.jason.designPatterns.command.cmd.CellingFanLowCommand;
import com.jason.designPatterns.command.cmd.CellingFanMediumCommand;
import com.jason.designPatterns.command.cmd.CellingFanOffCommand;
import com.jason.designPatterns.command.cmd.Command;
import com.jason.designPatterns.command.cmd.DoorCloseCommand;
import com.jason.designPatterns.command.cmd.GarageDoorOpenCommand;
import com.jason.designPatterns.command.cmd.LightOffCommand;
import com.jason.designPatterns.command.cmd.LightOnCommand;
import com.jason.designPatterns.command.cmd.MacroCommand;
import com.jason.designPatterns.command.cmd.StereoOffCommand;
import com.jason.designPatterns.command.cmd.StereoOnWithCDCommand;
import com.jason.designPatterns.command.door.Door;
import com.jason.designPatterns.command.door.GarageDoor;
import com.jason.designPatterns.command.electricalEquipment.CellingFan;
import com.jason.designPatterns.command.electricalEquipment.Stereo;
import com.jason.designPatterns.command.light.Light;

/**
 * 命令加载
 * 
 * @author liuwch
 * @creation 2018-6-20
 */
public class RemoteLoader {

	/**
	 * 初始化命令对象
	 */
	public static void initRemoteControl(RemoteControl remoteControl) {
		Stereo stereo = new Stereo();
		Light light = new Light("Ceiling");
		GarageDoor garageDoor = new GarageDoor();
		Door door = new Door();
		CellingFan cellingFan = new CellingFan();
		Command command1 = new LightOnCommand(light);
		Command command2 = new LightOffCommand(light);
		Command command3 = new StereoOnWithCDCommand(stereo);
		Command command4 = new StereoOffCommand(stereo);
		Command command5 = new CellingFanHighCommand(cellingFan);
		Command command6 = new CellingFanOffCommand(cellingFan);
		Command command7 = new CellingFanLowCommand(cellingFan);
		Command command8 = new CellingFanMediumCommand(cellingFan);
		Command command9 = new GarageDoorOpenCommand(garageDoor);
		Command command10 = new DoorCloseCommand(door);
		Command[] oncmds = {command1,command3,command5,command9};
		Command[] offcmds ={command2,command4,command6,command10};

		MacroCommand onMacroCommand = new MacroCommand(oncmds);
		MacroCommand offMacroCommand = new MacroCommand(offcmds);
		remoteControl.setCommand(0, command1, command2);
		remoteControl.setCommand(1, command3, command4);
		remoteControl.setCommand(2, command5, command6);
		remoteControl.setCommand(3, command7, command6);
		remoteControl.setCommand(4, command8, command6);
		remoteControl.setCommand(5, command9, command10);
		remoteControl.setCommand(6, onMacroCommand, offMacroCommand);
	}

}
