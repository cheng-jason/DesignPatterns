package com.jason.designPatterns.proxy;

import java.rmi.Naming;

import com.jason.designPatterns.proxy.gumball.GumballMachineProxy;
import com.jason.designPatterns.proxy.gumball.GumballMachineRemote;
import com.jason.designPatterns.proxy.gumball.GumballMonitor;

/**
 * 代理模式
 * 相关名词：
 * RMI(Remote Method Invocation):远程方法调用,能够让在客户端Java虚拟机上的对象像调用本地对象一样调用服务端java 虚拟机中的对象上的方法。
 * RPC(Remote Procedure Call Protocol):远程过程调用协议，通过网络从远程计算机上请求调用某种服务。
 * stub桩，存根  skeleton骨架
 * 相关命令：
 * 生成stub命令 rmic GumballMachine jdk1.5以后不再需要，而是与Proxy动态代理生成
 * 启动rmi服务
 * 	1>命令 rmiregistry
 * 	2>程序启动  LocateRegistry.createRegistry(1099);
 * 注册服务
 * 	1>执行命令  java GumballMachine(main方法)
 * 	2>程序注册 Naming.rebind("GumballMachine", gumballMachineRemote);
 * 使用服务
 * 	GumballMachineRemote gm = (GumballMachineRemote) Naming
			.lookup("rmi://10.10.11.176/GumballMachine");
 * @author liuwch
 * @creation 2018-8-21
 */
public class ProxyTest {

	public static void main(String[] arg) {
		try {
			//10.10.11.176   127.0.0.1
			GumballMachineRemote gm = (GumballMachineRemote) Naming
			.lookup("rmi://10.10.11.176/GumballMachine");
			GumballMachineRemote gm2 = (GumballMachineRemote) Naming
			.lookup("rmi://127.0.0.1/GumballMachine");
			GumballMonitor gumballMonitor = new GumballMonitor(gm);
			
			gumballMonitor.addGumballMachineRemote(gm2);
			gumballMonitor.report();
			
			GumballMachineProxy gumballMachineProxy = new GumballMachineProxy(gm);
			gumballMachineProxy.report();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
