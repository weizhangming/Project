package com.boco.demo05;

public class ThreadDemo01 {
	public static void main(String[] args) {
		Tickets t=new Tickets();
		Thread t0 = new Thread(t);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t0.start();t1.start();t2.start();
	}

}
