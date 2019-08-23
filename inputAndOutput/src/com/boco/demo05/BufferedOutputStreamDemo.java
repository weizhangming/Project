package com.boco.demo05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	//字节输出流的缓冲流
	//继承OutputStream
	//构造函数 BufferedOutputStream(outputStream) 可以传递任意的字节输出流
	public static void main(String[] args) throws IOException {
		function();
	}

	private static void function() throws IOException {
	   FileOutputStream out=new FileOutputStream("E:\\wei.txt");
	   BufferedOutputStream bout=new BufferedOutputStream(out);
	   bout.write("Hellowei".getBytes());
	   bout.close();
	}

}
