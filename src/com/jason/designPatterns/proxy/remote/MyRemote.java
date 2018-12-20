package com.jason.designPatterns.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * 远程代理 制作远程接口
 * Remote不具有方法，对RMI有特殊意义
 * @author liuwch
 * @creation 2018-8-21
 */
public interface MyRemote extends Remote {
	/**
	 * 网络与IO有风险
	 * 变量和返回值要是原语(primitive)类型或可序列化(Serializable)类型（自定义类需实现Serializable接口）
	 * @return 
	 * @throws RemoteException
	 */
	public String sayHello() throws RemoteException;
}
