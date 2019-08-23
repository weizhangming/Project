package com.boco.demo02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo02 {

	//FileOutputStream续写和换行
	public static void main(String[] args) throws IOException {
		function();
		
	}
	//追加写入
	public static void function() throws IOException {
		File file=new File("E:\\wei.text");
		OutputStream out=new FileOutputStream(file,true);
		out.write("\r\nworld".getBytes());
		out.close();
		
	}
	public static void function_1() throws IOException {
		OutputStream out=new FileOutputStream("E:\\wei.text");
		out.write("hello".getBytes());
		out.close();
	}
}
