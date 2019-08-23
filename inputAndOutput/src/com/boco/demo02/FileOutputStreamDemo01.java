package com.boco.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo01 {

	//写入数据文件，学习父类方法，使用子类对象
	//子类中的构造方法：作用绑定输出的输出目的；参数file 和 string
	public static void main(String[] args) throws IOException {
		function_1();
		
	}
	public static void function() throws IOException {
		OutputStream out=new FileOutputStream("E:\\wei.java");
		out.write(0);
		out.close();
	}
	public static void function_1() throws IOException {
		OutputStream out=new FileOutputStream("E:\\wei.text");
		out.write("hello".getBytes());
		out.close();
	}
}
