package com.boco.demo01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo06 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.boco.demo01.Person");
		Method[] methods = c.getMethods();//��ȡ������Ա���������̳е�
		for (Method method : methods) {
			System.out.println(method);
		}
		//getMethod(string ��������Class����...)
		Method method = c.getMethod("eat");
		Object newInstance = c.newInstance();
		method.invoke(newInstance);
	}
}
