package com.boco.demo05;

public class Tickets implements Runnable {

	private static int ticket = 100;

	public void run() {
		pay();
	}
	private static synchronized void pay() {
		while (true) {
			synchronized (Tickets.class) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "出售第"
							+ ticket-- + "票");
				}
			}
		}
	}
}
