package com.boco.demo02;

public class RunnableDemoTest01 {

	public static void main(String[] args) {
		RunnableDemo01 run=new RunnableDemo01();
		new Thread(run).start();
	}

}
