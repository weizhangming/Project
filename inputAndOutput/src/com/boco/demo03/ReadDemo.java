package com.boco.demo03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
	// read()读取1个字符
	// read(char[])读取字符数组
	//构造参数file或者string
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		function_1();
	}

	private static void function() throws IOException {
		FileReader read=new FileReader("E:\\wei.txt");
		int len=0;
		while((len=read.read())!=-1){
			System.out.println(len);
		}
	}	
	private static void function_1() throws IOException {
		FileReader read=new FileReader("E:\\wei.txt");
		int len=0;
		char[]b=new char[1024];
		while((len=read.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
	}

}
