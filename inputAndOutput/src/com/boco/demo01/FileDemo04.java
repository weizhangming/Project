package com.boco.demo01;

import java.io.File;

public class FileDemo04 {

	public static void main(String[] args) {
		function();

	}
	public static void function(){
		File file =new File("D:\\software\\Eclipse\\eclipse");
		String name = file.getName();		
		System.out.println(name);
		
		String path = file.getPath();
		System.out.println(path);
		
		long length = file.length();
		System.out.println(length);
		
		 file =new File("src");
		File absoluteFile = file.getAbsoluteFile();
		System.out.println(absoluteFile);
		
		file =new File("D:\\software\\Eclipse\\eclipse");
		File parentFile = file.getParentFile();
		System.out.println(parentFile);
	}

}
