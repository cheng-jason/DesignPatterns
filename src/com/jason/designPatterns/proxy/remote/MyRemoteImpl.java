package com.jason.designPatterns.proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 制作远程实现 远程服务对象扩展UnicastRemoteObject 用RMI Registry注册服务 产生stub命令rmic
 * MyRemoteImpl 启动rmiregistry 启动服务
 * 
 * @author liuwch
 * @creation 2018-8-21
 */
@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	protected MyRemoteImpl() throws RemoteException {
	}

	String word = "Hello world";

	public String sayHello() throws RemoteException {
		return word;
	}

	void setWord(String word) {
		this.word = word;
	}

	public static void main(String[] arg) {
		try {
			MyRemote myRemote = new MyRemoteImpl();
			MyRemoteImpl mr = (MyRemoteImpl) myRemote;
			mr.setWord("你好，世界");
			// 程序启动rmiregistry 默认接口1099
			System.out.println(LocateRegistry.getRegistry());
			if (LocateRegistry.getRegistry() == null) {
				LocateRegistry.createRegistry(1099);
			}
			// rebind如果已绑则进行重新绑定 bind首次绑定
			Naming.rebind("RemoteHello", myRemote);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
