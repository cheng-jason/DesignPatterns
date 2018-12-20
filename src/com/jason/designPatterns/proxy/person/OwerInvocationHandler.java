package com.jason.designPatterns.proxy.person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwerInvocationHandler implements InvocationHandler {
	PersonBean personBean;

	public OwerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if(method.getName().startsWith("get")){
				method.invoke(personBean, args);
			}else if(method.getName().equals("setHotOrNotRating")){
				throw new RuntimeException("不允许给自己评分");
			}else if(method.getName().startsWith("set")){
				method.invoke(personBean, args);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
