
package com.team.weekend03;

public class interface001 {
	@FunctionalInterface
	interface Multiplier {
		int mulitply(int i, int j);
//		int square(int j);
	};
	
	Multiplier multiplierLambda = (p,q) -> p*q;

	public static void main(String[] args) {
		interface001 client = new interface001();

	}

}
