package com.jason.designPatterns.proxy.remote;

import java.rmi.Naming;

/**
 * 客户代码
 * 
 * @author liuwch
 * @creation 2018-8-21
 */
public class MyRemoteClient {

	public void go() {
		try {
			MyRemote myRemote = (MyRemote) Naming
					.lookup("rmi://10.10.11.176/RemoteHello");
			System.out.println(myRemote.sayHello());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] arg) {
		new MyRemoteClient().go();
	}
}
