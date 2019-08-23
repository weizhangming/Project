package com.boco.thread;

public class ThreadDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		function();
		System.out.println(Math.abs(-1));

	}

	private static void function() {
		for(int i=0;i<10000;i++){
			System.out.println(i);	
		}	
	}

}
