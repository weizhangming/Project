package com.boco.demo01;

public class ThreadDemo02 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <5; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
	}

}
