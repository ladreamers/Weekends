package com.team.weekend03;

interface Engine{
	default String model() {
		return "make";
	}
}

interface Vehicle extends Engine {
	default String model() {
		return "model";
	}
	static String test() {
		return null;
	}
}

class Car implements Engine, Vehicle {
	
//	public String model() {
//		return "in class";
//	}
	
	String makeAndModel() {
		System.out.print(this.model());
		return null;
	}
}

public class multiInherit {

	public static void main(String[] args) {
		Car c = new Car();
		c.makeAndModel();

	}

}
