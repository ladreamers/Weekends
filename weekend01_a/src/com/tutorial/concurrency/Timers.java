package com.tutorial.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Timers {
	static int i = 0;
	static ScheduledFuture<?> future;
	static Runnable alarm;

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		alarm = () -> {
			System.out.println("ding ding ding ding - " + i);
			if (++i > 5) {
				System.out.println("end!");
				executor.shutdown();
			}
			else {
				System.out.println("next alarm in 3 seconds...");
				future = executor.schedule(alarm, 3, TimeUnit.SECONDS);
			}
		};
		
		alarm.run();

		delay(1337);

		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.printf("Remaining Delay: %sms\n", remainingDelay);
	}

	private static void delay(int milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
