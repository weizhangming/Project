package com.boco.demo07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class SerializeAndDeserialize {

	public static void main(String[] args) throws Exception {
		function_1();

	}

	private static void function() throws IOException {
		FileOutputStream file=new FileOutputStream("E:\\person.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		Person person =new Person("w", 2, "南");
		obj.writeObject(person);
	}

	private static void function_1() throws  Exception {
		FileInputStream file=new FileInputStream("E:\\person.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		Person p = (Person) obj.readObject();
		System.out.println(p);
		obj.close(); 
	}
}
