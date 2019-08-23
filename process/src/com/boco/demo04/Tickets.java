package com.boco.demo04;

public class Tickets implements Runnable {

	private Object obj = new Object();
	private int ticket = 100;

	public void run() {
		pay();
	}
	private synchronized void pay() {
		while (true) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "出售第"
						+ ticket-- + "票");
			}
		}
	}
}
