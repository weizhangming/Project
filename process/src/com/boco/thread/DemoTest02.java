package com.boco.thread;

public class DemoTest02 {
	public static void main(String[] args) {
		ThreadDemo02 d = new ThreadDemo02();//开线程
		d.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("main----" + i);
		}
	}

}
