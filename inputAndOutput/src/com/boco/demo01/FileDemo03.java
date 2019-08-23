package com.boco.demo01;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
	// 文件的创建与删除

	public static void main(String[] args) throws IOException {
		function_3();

	}

	public static void function() throws IOException {
		// 创建文件的功能;boolean CreateNewFile();创建的文件路径和文件名，在File的构造器中给出
		File file = new File("D:\\weizhangming");
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
	}

	public static void function_1() throws IOException {
		// 删除文件的功能;boolean delete();删除的文件路径和文件名，在File的构造器中给出
		File file = new File("D:\\weizhangming");
		boolean delete = file.delete();
		System.out.println(delete);
	}
	
	//文件夹创建
	public static void function_2() throws IOException {
		// 创建文件夹的功能;boolean mkdir();创建单层文件夹，在File的构造器中给出
		// 创建文件夹的功能;boolean mkdirs();创建多层文件夹，在File的构造器中给出
		File file = new File("D:\\weizhangming");
		boolean make = file.mkdir();
		System.out.println(make);
	}
	//文件夹删除
		public static void function_3() throws IOException {
			// 创建文件夹的功能;boolean mkdir();创建单层文件夹，在File的构造器中给出
			File file = new File("D:\\weizhangming");
			boolean make = file.delete();
			System.out.println(make);
		}
}
