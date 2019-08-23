package com.boco.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//OutputStreamWriter 继承Writer
//字符输出流，写文本文件
//字符流转换字节流 
public class OutputStreamWriterDemo01 {

	public static void main(String[] args) throws IOException {
		function();
	}

	private static void function() throws IOException {
		//首先创建字节输出流，并绑定数据文件
		FileOutputStream out=new FileOutputStream("E:\\wei.txt");
		//创建转换流对象，构造方法绑定字节输出流。
		OutputStreamWriter write=new OutputStreamWriter(out,"UTF-8");
		//转换流写数据。 默认是GBK
		write.write("你好");
		write.flush();
	}
}
