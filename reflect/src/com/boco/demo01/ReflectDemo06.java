package com.boco.demo01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo06 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.boco.demo01.Person");
		Method[] methods = c.getMethods();//获取公共成员方法包含继承的
		for (Method method : methods) {
			System.out.println(method);
		}
		//getMethod(string 方法名，Class参数...)
		Method method = c.getMethod("eat");
		Object newInstance = c.newInstance();
		method.invoke(newInstance);
	}
}
