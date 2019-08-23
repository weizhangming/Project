package com.boco.demo03;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	//write 所有字符输出流的超类，写文本文件
	//方法有write(int c) 写一个字符
	//write(char[] c) 写字符数组
	//write(char[]c,int, int c)写一部分字符数组
	//write(String)写入字符串
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        function_3();
	}

	private static void function() throws IOException {
		FileWriter write=new FileWriter("E:\\ming.text");
		write.write(100);
		write.flush();
		write.close();
		
	}
	private static void function_1() throws IOException {
		FileWriter write=new FileWriter("E:\\ming.text");
		char [] c={'h','e','l','l','o'};
		write.write(c);
		write.flush();
		write.close();
		
	}
	private static void function_2() throws IOException {
		FileWriter write=new FileWriter("E:\\ming.text");
		char [] c={'h','e','l','l','o'};
		write.write(c,0,4);
		write.flush();
		write.close();		
	}
	private static void function_3() throws IOException {
		FileWriter write=new FileWriter("E:\\ming.text");
		write.write("HelloWorld");
		write.flush();
		write.close();		
	}

}
