package com.boco.demo03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.boco.demo02.RunnableDemo01;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newFixedThreadPool(5);
		threadpool.submit(new RunnableDemo01());
	}

}
