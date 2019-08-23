package com.boco.demo09;

import org.apache.commons.io.FilenameUtils;

public class Commons_IODemo {

	public static void main(String[] args) {
		String extension = FilenameUtils.getExtension("abc.txt.as");
		boolean extension2 = FilenameUtils.isExtension("a.java", "java");
		System.out.println(extension2);
	}

}
