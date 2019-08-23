package com.boco.demo08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteDemo01 {

	public static void main(String[] args) throws IOException {
		function_1();
	}

	private static void function() throws IOException {
		File file = new File("E:\\ming.txt");
		PrintWriter writer = new PrintWriter(file);
		writer.print("I LIKE JAVA");
		writer.flush();
		writer.close();
	}

	// 自动刷新
	// 1 输出目的必须是输出流outputstream或者使用Writer
	// 2调用println format printf三个方法中的一个
	private static void function_1() throws IOException {
		FileWriter file=new FileWriter("E:\\zhang.txt");
		PrintWriter writer = new PrintWriter(file,true);
		writer.println("I LIKE JAVA");
	}

}
