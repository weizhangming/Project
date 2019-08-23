package com.boco.demo01;

import java.io.File;

public class FileDemo05 {

	public static void main(String[] args) {
		function_1();

	}

	public static void function() {
		File file = new File("D:\\weizhangming");
		boolean exists = file.exists();
		System.out.println(exists);
	}

	public static void function_1() {
		File file = new File("D:\\software");
		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	public static void function_2() {
		File file = new File("D:\\software");
		File[] list = file.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	// 过滤
	public static void function_3() {
		File file = new File("D:\\software");
		File[] list = file.listFiles(new MyFilter());
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
