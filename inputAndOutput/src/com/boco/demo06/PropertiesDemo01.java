package com.boco.demo06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
	public static void main(String[] args) throws IOException {
		function_2();
	}

	private static void function() {
		Properties p=new Properties();
		p.setProperty("wei", "100");
		p.setProperty("zhang", "200");
		p.setProperty("ming", "300");
		System.out.println(p);
		System.out.println(p.getProperty("ming"));
		Set<String> names = p.stringPropertyNames();
		for (String name : names) {
			System.out.println(p.getProperty(name));
		}
	}
	private static void function_1() throws IOException {
		Properties p=new Properties();
		FileReader read=new FileReader("E:\\pro.properties");
		p.load(read);
		read.close();
		System.out.println(p);
	}
	private static void function_2() throws IOException {
		Properties p=new Properties();
		p.setProperty("name", "li");
		p.setProperty("sex", "woman");
		FileOutputStream out=new FileOutputStream("E:\\pro.properties");
		p.store(out, "love");
	
	}
	
}
