package com.boco.demo01;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if(pathname.getName().endsWith(".java")){
			//pathname.toString().endsWith(".java")
			return true;
		}else{
			return false;
		}
		
	}
}
