package com.team.weekend02;

import java.util.Arrays;
import java.util.List;

public class StreamMapperExample {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Apple","Bee","Camel","Dick","Ester");
		
		System.out.println("Imperial Style: ");
		for(String name : names) {
			if (!name.equals("Bee")) {
				System.out.println(name);
			}
		}
		//int x = (int v) -> {a+x}
		System.out.println("Functional Style1: ");
		names.stream()
			.filter(StreamMapperExample::isNotBee)
			.forEach(System.out::println);
		
		System.out.println("Functional Style2: ");
		names.stream()
			.filter(StreamMapperExample::isNotBee)
			.map(name -> {
				User user = new User(name);
				return user;
			})
			.forEach(System.out::println);
		
		System.out.println("Functional Style3: ");
		names.stream()
			.filter(StreamMapperExample::isNotBee)
			.map(User::new)
			.forEach(System.out::println);
		
	}
	
	private static boolean isNotBee(String name) {
		return !name.equals("Bee");
	}
	
	static class User {
		private String name;
		private Integer age;
		
		public User(String name) {
			this.name = name;
			this.age = age = 1;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "name: " + name + " age: " + age;
		}
		
	}
	
}
