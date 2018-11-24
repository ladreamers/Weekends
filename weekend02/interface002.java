package com.team.weekend03;

public class interface002 {

	@FunctionalInterface
	interface Cruncher {
		int crunch(int i, int j);
	};
	
	public int cruncherService(int i, int j, Cruncher cruncher) {
		return cruncher.crunch(i, j);
	}
	
	public static void main(String[] args) {
		interface002 client = new interface002();
		
		//Client 1
//		client.cruncherService(4, 5, cruncher);
		int ans = client.cruncherService(4, 5, (int p, int q) -> p*q);
		System.out.println("Answer: " + ans);
		
		ans = client.cruncherService(4, 5, (p, q) -> p+q);
		System.out.println("Answer: " + ans);
	}

}
