package com.boco.demo02;

public class RunnableDemo01 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i);		
		}
	}



}
