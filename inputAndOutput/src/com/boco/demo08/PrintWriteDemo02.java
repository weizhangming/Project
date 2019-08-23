package com.boco.demo08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteDemo02 {

	public static void main(String[] args) throws IOException {
		function();
	}

	//打印流实现文本的复制
	/*
	 * 读取数据源BufferedReader+file 读取文本行
	 * 写入数据目的printWriter+println 自动刷新
	 */
	private static void function() throws IOException {
		FileReader file=new FileReader("E:\\zhang.txt");
		BufferedReader read=new BufferedReader(file);
		
		FileWriter f=new FileWriter("E:\\cei.txt");
		PrintWriter writer = new PrintWriter(f,true);
		String line=null;
		while ((line=read.readLine())!=null){
			writer.println(line);
		}
		writer.close();
		read.close();
	}
}
