package com.boco.demo06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
	private int ticket = 100;

	private Lock lock=new ReentrantLock();
	public void run() {
		pay();
	}
	private synchronized void pay() {
		
		while (true) {
			lock.lock();
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "出售第"
						+ ticket-- + "票");
			}
			lock.unlock();
		}
		
	}
}
