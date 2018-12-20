package com.jason.designPatterns.proxy.person;

import java.lang.reflect.Proxy;

/**
 * 代理模式 动态代理
 * 
 * @author liuwch
 * @creation 2018-8-27
 */
public class PersonTest {

	public static void main(String[] arg) {
		try {
			PersonBean personBean = new PersonBeanImpl();
			
			PersonBean owerBean = getOwerProxy(personBean);
			PersonBean nonOwerBean = getNoneOwerProxy(personBean);
			owerBean.setName("jason");
			owerBean.setGender("male");
			
			nonOwerBean.setHotOrNotRating(5);
			nonOwerBean.setHotOrNotRating(3);
			nonOwerBean.setHotOrNotRating(1);
			nonOwerBean.setHotOrNotRating(1);
			
			System.out.println(personBean);
			//以下操作不允许
			owerBean.setHotOrNotRating(1);
			nonOwerBean.setName("jasons");
			nonOwerBean.setInterests("Football");
			nonOwerBean.setGender("female");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 本人代理
	 * @param personBean
	 * @return
	 */
	public static PersonBean getOwerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(
				personBean.getClass().getClassLoader(), 
				personBean.getClass().getInterfaces(),
				new OwerInvocationHandler(personBean));
	}
	/**
	 * 非本人代理
	 * @param personBean
	 * @return
	 */
	public static PersonBean getNoneOwerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(
				personBean.getClass().getClassLoader(), 
				personBean.getClass().getInterfaces(),
				new NonOwerInvocationHandler(personBean));
	}
	
}
