package com.boco.demo01;

import java.io.File;

public class FileDemo02 {

	public static void main(String[] args) {
		function_2();

	}
	public static void function(){
		//File(string pathname),既可以文件也可以文件夹
		File file=new File("D:\\software");
		System.out.println(file);
	}
	
	public static void function_1(){
		//File(string parent,string child),
		File file=new File("C:","window");
		System.out.println(file);
	}
	
	public static void function_2(){
		//File(file parent,string child),文件对象父亲
		File parent=new File("C:");
		File file=new File(parent,"window");
		System.out.println(file);
	}


}
