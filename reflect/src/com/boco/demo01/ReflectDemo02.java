package com.boco.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.boco.demo01.Person");
		//获取指定的构造方法，有参数的构造方法 c.getConstructor(string)
		Constructor constructor = c.getConstructor(String.class,int.class);
		System.out.println(constructor);
		//运行构造方法  constructor.newInstance
		Object newInstance = constructor.newInstance("weizhang",25);
		System.out.println(newInstance);
	}
}
