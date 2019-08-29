package com.boco.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectDemo04 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("com.boco.demo01.Person");
		//Constructor[] declaredConstructors = c.getDeclaredConstructors();//���Ի�ȡ���еĹ��캯������˽��
		 Constructor declaredConstructor = c.getDeclaredConstructor(int.class,String.class);
		 System.out.println(declaredConstructor);
		 //����
		 declaredConstructor.setAccessible(true);//���ÿɵ�
		 Object newInstance = declaredConstructor.newInstance(2,"w");
		 System.out.println(newInstance);
		}
}
