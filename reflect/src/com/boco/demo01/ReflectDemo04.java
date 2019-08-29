package com.boco.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectDemo04 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.boco.demo01.Person");
		//Constructor[] declaredConstructors = c.getDeclaredConstructors();//可以获取所有的构造函数包含私有
		 Constructor declaredConstructor = c.getDeclaredConstructor(int.class,String.class);
		 System.out.println(declaredConstructor);
		 //运行
		 declaredConstructor.setAccessible(true);//设置可到
		 Object newInstance = declaredConstructor.newInstance(2,"w");
		 System.out.println(newInstance);
		}
}
