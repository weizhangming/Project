package com.boco.demo01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo05 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class c = Class.forName("com.boco.demo01.Person");
		//获取string name
		Field field2 = c.getField("name");
		//修改成员变量的值 field.set(object obj, object value);
		
		Object newInstance = c.newInstance();
		
		field2.set(newInstance, "zhangsan");
		System.out.println(newInstance);
		System.out.println(field2);
             Field[] fields = c.getFields();
             for (Field field : fields) {
				System.out.println(field);
			}
		}
}
