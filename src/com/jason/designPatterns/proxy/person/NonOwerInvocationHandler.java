package com.jason.designPatterns.proxy.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwerInvocationHandler implements InvocationHandler {
	PersonBean personBean;

	public NonOwerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				method.invoke(personBean, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				method.invoke(personBean, args);
			} else if (method.getName().startsWith("set")) {
				throw new RuntimeException("不允许修改他人信息");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
