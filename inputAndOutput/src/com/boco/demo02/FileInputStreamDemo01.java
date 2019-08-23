package com.boco.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {

	public static void main(String[] args) throws IOException {		
		function_1();	
	}
	private static void function() throws IOException {
		File file=new File("E:\\wei.text");
		FileInputStream in=new FileInputStream(file);
		char read = (char)in.read();
		System.out.println(read);
		in.close();		
	}
	private static void function_1() throws IOException {
		File file=new File("E:\\wei.text");
		FileInputStream in=new FileInputStream(file);
		int len=0;
		while((len=in.read())!=-1){
			
			System.out.println(len);
		}		
		in.close();		
	}

}
