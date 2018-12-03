package com.tutorial.concurrency;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadResults {

	public static void main(String[] args) {
		Callable<String> getName = () -> {
		    System.out.println("getName start...");
			delay(50);
		    System.out.println("getName end");
	        return "Jesse";
		};
		Callable<Date> getBirthday = () -> {
		    System.out.println("getBirthday start...");
			delay(3);
		    System.out.println("getBirthday end");
	        return Calendar.getInstance().getTime();
		};
		Callable<Double> getSalary = () -> {
		    System.out.println("getSalary start...");
			delay(1);
		    System.out.println("getSalary end");
	        return 9.99;
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<String> name = executor.submit(getName);
		Future<Date> birthday = executor.submit(getBirthday);
		Future<Double> salary = executor.submit(getSalary);
	    System.out.println("threads are running...");

		try {
		    System.out.println("is getName done? " + name.isDone());
			String n = name.get();
		    System.out.println("Name=" + n);
		    System.out.println("is getBirthday done? " + birthday.isDone());
			Date d = birthday.get();
		    System.out.println("birthday=" + d);
		    System.out.println("is getSalary done? " + salary.isDone());
			Double dd = salary.get(1, TimeUnit.SECONDS);
		    System.out.println("salary=" + dd);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
