package com.boco.demo01;

public class DemoTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadDemo01 th=new ThreadDemo01();
		th.start();
		Thread t = Thread.currentThread();
		System.out.println(t.getName());

	}

}
