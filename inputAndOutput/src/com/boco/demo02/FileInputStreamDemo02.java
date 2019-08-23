package com.boco.demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
   //read(btye[]b)读取字节数组
	public static void main(String[] args) throws IOException {		
		function();	
	}
	private static void function() throws IOException {
		File file=new File("E:\\wei.text");
		FileInputStream in=new FileInputStream(file);
		byte[]b=new byte[2];//建议长度1024
		//int read = in.read(b);
		int len=0;
		while((len=in.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}
//		System.out.println(read);//2
//		System.out.println(new String(b));//he 
		in.close();		
	}

}
