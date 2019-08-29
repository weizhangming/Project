package com.boco.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectDemo01 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.boco.demo01.Person");
//		// 使用class文件对象，获取类的构造方法
//		Constructor[] constructors = c.getConstructors();// 获取所有的公共的构造方法
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//		}
		//获取指定的构造方法，空参数的构造方法
		Constructor constructor = c.getConstructor();
		System.out.println(constructor);
		//运行构造方法  constructor.newInstance
		Object newInstance = constructor.newInstance();
		System.out.println(newInstance);
	}
}
