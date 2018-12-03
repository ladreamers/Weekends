package com.tutorial.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	public static void main(String[] args) {
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("thread " + threadName + " start**...");
			delay(2);
		    System.out.println("thread " + threadName + " end**");
		});

		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("thread " + threadName + " start*...");
			delay(1);
		    System.out.println("thread " + threadName + " end*");
		});
		
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("thread " + threadName + " start**...");
			delay(2);
		    System.out.println("thread " + threadName + " end**");
		});

		//shutdown so program terminates.
		System.out.println("Main done");
		executor.shutdown();
	}

	private static void delay(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
