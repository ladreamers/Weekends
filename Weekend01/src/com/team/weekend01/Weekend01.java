package com.team.weekend01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Weekend01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Weekend01.defaultMethod();
		
		// a lambda expression is a function that can be referenced and passed around as an object.
		//Weekend01.lambdaExample();
		
		//Weekend01.collectionTasks();
		
		// Functional Interface – an interface with maximum one abstract method, implementation can be provided using a Lambda Expression
		
		//### COME BACK TO THIS...
		// Method References − enable defining Lambda Expressions by referring to methods directly using their names
		
		// What is the difference between JPA and Hibernate?
		
		// How do we connect to a external database like MSSQL or oracle?
		//	-- Step 1 - Add dependency for mqsql connector to pom.xml
		//	-- Step 2 - Remove H2 Dependency from pom.xml
		// 	-- Step 3 - Setup your My SQL Database
		// 	-- Step 4 - Configure your connection to My SQL Database
		//	-- Step 5 - Restart and You are ready!

	}
	
	// ##########################################################################
	public static void defaultMethod(){
		(new DefaultMethodClass()).move();
	}

	// ##########################################################################
	public static void lambdaExample(){
		
		// anonymous interface implementation
		Comparator<String> stringComparator = new Comparator<String>(){

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
				
				//return 0;
			}
		};
		System.out.println(stringComparator.compare("hello", "hello"));
		
		// matching lambda..
		Comparator<String> stringComparatorLambda = (arg0, arg1) -> { return arg0.compareTo(arg1); };
		System.out.println(stringComparatorLambda.compare("hello", "hello"));
	}
	//##########################################################################
	public static void collectionTasks(){
	       
	      int size;
	      Iterator iterator;
	      HashSet <String>collection = new HashSet <String>();
	      
	      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
	      collection.addAll(list);
	      System.out.println("Max Value: " + Collections.max(collection));
	      System.out.println("Min Value: " + Collections.min(collection));
	      
	      
	      String str2 = "three";
	      System.out.print("Collection data: ");  
	      iterator = collection.iterator();     
	      
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      
	      //
	      // ### IS THIS (remove) THREAD SAFE?
	      //
	      
	      collection.remove(str2);
	      System.out.println("After removing [" + str2 + "]\n");
	      System.out.print("Now collection data: ");
	      iterator = collection.iterator();     
	      
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      size = collection.size();
	      System.out.println("Collection size: " + size + "\n");		
	}
		
		
	
}




// ##########################################################################
// private class
class DefaultMethodClass implements DefaultMethodInterface{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.scare();
		
	}
	
//	@Override
//	public void scare() {
//		// TODO Auto-generated method stub
//		System.out.println("New scare!!");
//		
//	}	
}
