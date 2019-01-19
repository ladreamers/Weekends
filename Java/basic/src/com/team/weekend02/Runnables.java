package com.team.weekend02;
/*Single abstract method in interface.
 * 
 * 
 */
import java.util.concurrent.Callable;

public class Runnables {

	public void methodAcceptingRunnable(Runnable r) {
		
	}
	
	public void methodAcceptCallable(Callable c) {
		
	}
	
	public static void main(String[] args) {
		Runnable runnable = ( ) -> System.out.println("hello lambda");
		
		new Runnables().methodAcceptingRunnable(runnable);
		
		new Runnables().methodAcceptingRunnable(() -> {
			System.out.println("block of lambda");
		});
		
		Callable callable = () -> "hello callable";
		
		new Runnables().methodAcceptCallable(( ) -> {
			return "hello";
		});
		
	}
	
	interface Tradable<Trade>{
		boolean check(Trade t);
	};
	
	Tradable<Trade> bigTradeLambda = (trade) -> trade.isBigTrade();
	
	Tradable<Trade> ibmTradeLambda = (trade) -> trade.getInstrument().equals("IBM");
}
