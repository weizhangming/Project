package com.boco.demo04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		function();
	}

	private static void function() throws IOException {
		//创建自己输入流，传达文本文件
		FileInputStream in=new FileInputStream("E:\\wei.txt");
		//转换流对象，封装输入流，写编码格式
		InputStreamReader reader= new InputStreamReader(in, "UTF-8");
		int len=0;
		char[]b=new char[20];
		while((len=reader.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
	}

}
