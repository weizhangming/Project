package com.boco.demo01;

public class FileDemo07 {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();		
		int sum = function(5000);
		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
		

	}
	public static int function(int n){
		if(n==1)
			return 1;
		return n+function(n-1);
	}

}
