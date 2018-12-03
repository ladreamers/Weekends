package com.tutorial.concurrency;

import java.util.concurrent.TimeUnit;

public class Refresher {

	public static void main(String[] args) {
		Runnable r1 = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("thread " + threadName + " start...");
			delay(2);
		    System.out.println("thread " + threadName + " end");
		};
		Runnable r2 = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("thread " + threadName + " start...");
			delay(3);
		    System.out.println("thread " + threadName + " end");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done!");
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
