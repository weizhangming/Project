package com.boco.demo01;

import java.io.File;

public class FileDemo06 {

	public static void main(String[] args) {
		File file=new File("D:\\software\\MySql");
		function(file);

	}
	public static void function(File file){
		File[] list = file.listFiles();
		for (File file2 : list) {
			System.out.println(file2);
			if(file2.isDirectory()){
				function(file2);
			}else{
				System.out.println(file2);
			}
				
		}
	}

}
