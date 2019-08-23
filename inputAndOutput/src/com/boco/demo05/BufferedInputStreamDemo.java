package com.boco.demo05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	
	public static void main(String[] args) throws IOException {
		function();
	}

	private static void function() throws IOException {
	   FileInputStream in=new FileInputStream("E:\\wei.txt");
	   BufferedInputStream bout=new BufferedInputStream(in);
	  byte[] b=new byte[10];
	  int len=0;
	  while((len=bout.read(b))!=-1){
		  System.out.println(new String(b,0,len));
	  }
	}

}
