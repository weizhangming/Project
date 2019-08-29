package com.boco.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.boco.demo01.Person");
		//��ȡָ���Ĺ��췽�����в����Ĺ��췽�� c.getConstructor(string)
		Constructor constructor = c.getConstructor(String.class,int.class);
		System.out.println(constructor);
		//���й��췽��  constructor.newInstance
		Object newInstance = constructor.newInstance("weizhang",25);
		System.out.println(newInstance);
	}
}
