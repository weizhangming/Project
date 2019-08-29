package com.boco.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectDemo01 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.boco.demo01.Person");
//		// ʹ��class�ļ����󣬻�ȡ��Ĺ��췽��
//		Constructor[] constructors = c.getConstructors();// ��ȡ���еĹ����Ĺ��췽��
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//		}
		//��ȡָ���Ĺ��췽�����ղ����Ĺ��췽��
		Constructor constructor = c.getConstructor();
		System.out.println(constructor);
		//���й��췽��  constructor.newInstance
		Object newInstance = constructor.newInstance();
		System.out.println(newInstance);
	}
}
