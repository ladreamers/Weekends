package com.team.weekend01;

import java.util.Date;
import java.util.List;
import java.util.Set;
 
class Test {
  public static void main(String[] args) {

    /*SingleLinkedListImpl sl = new SingleLinkedListImpl();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        sl.reverse();
        sl.traverse();*/
  }


 
  public static void sumOfTwoElementsClosestToZero(int[] a) {
    /*
     * Please implement this method to print the sum of the two elements
     * closest to zero. If there are two elements equally close to zero like
     * -2 and 2, consider the positive element to be "closer" to zero than
     * the negative one.
     */
  }
 
  public static Object[] reverseArray(Object[] a) {
    /*
     * Please implement this method to return a new array where the order of
     * elements has been reversed from the original array.
     */
    return null;
  }
 
  public static void sortIgnoringSpaces(String[] a) {
    /*
     * Please implement this method to sort a given array of Strngs in
     * alphabetical order ignoring spaces (' ' symbols) within the strings.
     */
  }
 
  public static boolean isPalindrome(String s) {
    /*
     * Definition: A palindrome is a string that reads the same forward and
     * backward. For example, "abcba" is a palindrome, "abab" is not. Please
     * implement this method to return true if the parameter is a palindrome
     * and false otherwise.
     */
    return false;
  }
 
  public static void printUniqueElements(Set<Object> a, Set<Object> b) {
    /*
     * Please implement this method to print elements that can be found only
     * in set a or set b, but not in both Sets. The method should not change
     * the content of the parameters.
     */
  }
 
  public static void removeDuplicate(List<Employee> a) {
    /*
     * Please implement this method to Identify and eliminate duplicate
     * <Employee> objects
     */
   
    /*
    The input list should be initialized before calling this method, feel free to add methods to Employee class if needed. The list should contain at least the below elements
    Add 5 employee objects to the list,
    Add one object twice
    Add an employee object that has the same firstName, lastName and dob as another
    */
  }
 
  class Employee {
    private String firstName;
    private String lastName;
    private Date dob;
 
  }
 
  public static void printCorrectChange(int cents) {
    /*
     * Please implement this method to take cents as a parameter and print
     * an equal amount in dollars and coins using the minimum number of
     * coins possible. For example: 164 cents = 1 dollar, 2 quarters, 1 dime
     * and 4 cents. Return null if the parameter is negative.
     */
  }
 
  /*
   * Debug this program and fix/implement the following
   * 1. "add" method is running in infinite loop
   * 2. Implement "reverse" method to reverse this linked list
   */
  static class SingleLinkedListImpl {
    private Node head;
 
    public void add(Integer element) {
      Node nd = new Node();
      nd.setValue(element);
      System.out.println("Adding: " + element);
      Node tmp = head;
      while (true) {
        if (tmp == null) {
          head = nd;
        } else if (tmp.getNextRef() == null) {
          tmp.setNextRef(nd);
        } else {
          tmp = tmp.getNextRef();
        }
      }
    }
 
    public void traverse() {
 
      Node tmp = head;
      while (true) {
        if (tmp == null)
          break;
        System.out.print(tmp.getValue() + "\t");
        tmp = tmp.getNextRef();
      }
    }
 
    public void reverse() {
      System.out.println("\nreversing the linked list\n");
 
    }
 
  }
 
  static class Node implements Comparable<Integer> {
    private Integer value;
    private Node nextRef;
 
    public Integer getValue() {
      return value;
    }
 
    public void setValue(Integer value) {
      this.value = value;
    }
 
    public Node getNextRef() {
      return nextRef;
    }
 
    public void setNextRef(Node ref) {
      this.nextRef = ref;
    }
 
    @Override
    public int compareTo(Integer arg) {
      if (arg == this.value) {
        return 0;
      } else {
        return 1;
      }
    }
  }
 
   public static int countWaysToJump(int N) {
                return N;
        /*
          A set of stairs has N steps.
          You can jump either 1 or 2 steps at a time.
          For example, if the stairs is N=4 steps, you can reach the end in 5 possible ways:
          1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2
          Please implement this method to
          return the count of the different ways to reach the end of the stairs with N steps.
         */
     
 
    }
 
}