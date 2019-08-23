package com.boco.demo01;

import java.io.File;

public class FileDemo01 {

	public static void main(String[] args) {
		function();

	}
	public static void function(){
		String pathseparator = File.pathSeparator;
		System.out.println(pathseparator);//;
		pathseparator=File.separator;
		System.out.println(pathseparator);
	}

}
