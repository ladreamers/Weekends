package com.team.weekend01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/*
* To execute Java, please define "static void main" on a class
* named Solution.
*
* If you need more classes, simply define them inline.
*/
 
class Solution {
 
       public static void main(String[] args) {
              ArrayList<String> strings = new ArrayList<String>();
              strings.add("Welcome to Lord Abbett.");
              strings.add("This pad is running Java 8.");
              System.out.println(strings);
 
              // sumOfTwoElementsClosestToZero
              // ////////////////////////////////////////
              sumOfTwoElementsClosestToZero(null);
              sumOfTwoElementsClosestToZero2(new int[]{-4, 2, -10, 8, 9, 1, -3, 12});
 
              // countDays //////////////////////////////////////////////////////////
              System.out.println("Days between these 2 dates: "
                           + countDays("10022018", "13022018"));
 
              System.out.println(countDays2("02/08/2018", "02/28/2018"));
              // maxWordCount
              // //////////////////////////////////////////////////////////
              System.out
                           .println("maxWordCount: "
                                         + maxWordCount("wheels on the bus go round and round , round and round , round and round"));
 
              // getMiddleIntegers
              // /////////////////////////////////////////////////////
              System.out.println(getMiddleIntegers(new Object[] { 0, 4, "Hello", 2,1, "World" }));
 
              // reverseArray
              // //////////////////////////////////////////////////////////
              Object arr[] = { 1, 60, -10, 70, -80, 85 };
              reverseArray(arr);
 
              // isPalindrome
              // //////////////////////////////////////////////////////////
              System.out.println("Is Paladrome: " + isPalindrome("andna"));
 
              // printUniqueElements
              // ////////////////////////////////////////////////////
              Set<Object> s1 = new HashSet<Object>();
              Set<Object> s2 = new HashSet<Object>();
              s1.add(2);
              s1.add(1);
              s2.add(3);
              s2.add(1);
              printUniqueElements(s1, s2);
 
              // printCorrectChange
              // /////////////////////////////////////////////////////
              printCorrectChange(100);
 
       }
 
       // //countWaysToJump
       // int n = 5;
       // int size = 100;
       // int[] arr = new int[size];
       // System.out.println("Different compositions formed by 1, 2 and 3 of "+ n +
       // " are");
       // countWaysToJump(arr, n, 0);
 
       /* Problems Start From here... */
      
      
       public static void sumOfTwoElementsClosestToZero2(int[] a) {
              int curr = 0;
           int near = a[0];
          
           Arrays.sort(a);
          
           for(int i =0; i< a.length; i++){
             curr = a[i]*a[i];
             if(curr <= (near * near)){
               near = a[i];
             }
           }
           System.out.println("End of sumOfTwoElementsClosestToZero2: "+near);
       }
       
    
 
       public static void sumOfTwoElementsClosestToZero(int[] a) {
              /*
              * Please implement this method to print the sum of the two elements
              * closest to zero. If there are two elements equally close to zero like
              * -2 and 2, consider the positive element to be "closer" to zero than
              * the negative one.
              */
 
              /*
              * A solution ***************************************************
              * Algorithm:
               * 1) Sort all the elements of the input array.
               * 2) Use two
              * index variables l and r to traverse from left and right ends
              * respectively. Initialize l as 0 and r as n-1.
               * 3) sum = a[l] + a[r]
               * 4) If sum is -ve, then l++
               * 5) If sum is +ve, then r–
               * 6) Keep track of  abs min sum.
               * 7) Repeat steps 3, 4, 5 and 6 while l < r Implementation
              *
               * ****************************************************
              */
 
              int arr[] = { 1, 60, -10, 70, -80, 85 };
              int arr_size = arr.length;
              int inv_count = 0;
              int l, r, min_sum, sum, min_l, min_r;
 
              /* Array should have at least two elements */
              if (arr_size < 2) {
                     System.out.println("Invalid Input");
                     return;
              }
 
              /* Initialization of values */
              min_l = 0;
              min_r = 1;
              min_sum = arr[0] + arr[1];
 
              for (l = 0; l < arr_size - 1; l++) {
                     for (r = l + 1; r < arr_size; r++) {
                           sum = arr[l] + arr[r];
                           if (Math.abs(min_sum) > Math.abs(sum)) {
                                  min_sum = sum;
                                  min_l = l;
                                  min_r = r;
                           }
                     }
              }
 
              System.out.println(" The two elements whose sum is minimum are "
                           + arr[min_l] + " and " + arr[min_r]);
       }
      
       public static int countDays2(String startDate, String endDate) {
              int countDays = 0;
           
            String startYear = startDate.substring(6);
            String startMonth = startDate.substring(0,1);
            String startDay = startDate.substring(3,4);
           
            String endYear = endDate.substring(6);
            String endMonth = endDate.substring(0,1);
            String endDay = endDate.substring(3,4);
           
            if(startYear.equals(endYear)){
               if(startMonth.equals(endMonth)){
                 if(startDay.equals(endDay)){
                   return 0;
                 }
                 else{
                   countDays = Integer.valueOf(endDay) - Integer.valueOf(startDay);
                
                 }//end date counting
                  
               }
              else{
             
              }//end month counting
            }
            else{
           
            }//end year counting
      
            System.out.println("End of countDays: "+countDays);
            return countDays;
       }
       public static int countDays(String startDate, String endDate) {
              /*
              * Find out the number of day in between start date and2 end date User
              * input date format MM/dd/yyyy ex. for inputs : startDate =
              * "02/08/2018" endDate "02/28/2018" return 20 for inputs : startDate =
              * "02/08/2018" endDate "03/01/2018" return 21
              */
             
             
             
 
 
              /****
              * Solution 1
              */
              Calendar cal1 = new GregorianCalendar();
              Calendar cal2 = new GregorianCalendar();
 
              SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
 
              Date date;
              try {
                     date = sdf.parse(startDate);
                     cal1.setTime(date);
                     date = sdf.parse(endDate);
                     cal2.setTime(date);
              } catch (ParseException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
 
              long end = cal2.getTimeInMillis();
              long start = cal1.getTimeInMillis();
              return (int) (end - start) / ((1000 * 60 * 60 * 24));
       }
      
      
//     private static List<String> filterString(String[] input, String filterOut) {
//           
//            List<String> lines = Arrays.asList("spring", "node", "hello");
//
//             List<String> result = lines.stream()                // convert list to stream
//                     .filter(line -> !"hello".equals(line))     // we dont like mkyong
//                     .collect(Collectors.toList());              // collect the output and convert streams to a List
//
//             result.forEach(System.out::println);                //output : spring, node
//
//     }
 
       public static String maxWordCount(String input) {
              /*
              * Write a program to find word with maximum number of occurences in a
              * sentence ex. input : wheels on the bus go round and round , round and
              * round , round and round return: round
              */
 
              String maxWord = "";
              String[] words = input.split(" ");
              HashMap<String, Integer> map = new HashMap<String, Integer>();
              for (int i = 0; i < words.length; i++) {
                     if (map.containsKey(words[i]))
                           map.put(words[i], map.get(words[i]) + 1);
                     else
                           map.put(words[i], 1);
              }
              int max = 0;
              for (Map.Entry<String, Integer> entry : map.entrySet()) {
                     if (Integer.parseInt(entry.getValue().toString()) > max) {
                           max = Integer.parseInt(entry.getValue().toString());
                           maxWord = entry.getKey().toString();
                     }
              }
 
              return maxWord;
       }
 
       public static int[] getMiddleIntegers(Object[] a) {
              /*
              * Write a function to return the middle integers in an array of
              * Objects. So if the input array contained the following values: 1)
              * ['Test', 3.235, 2, 3, 1, 'a', '1'] returns [2] 2)
              * [0,4,'Hello',2,1,'World'] returns [1,2] 3)
              * [1,10,7,7,'Answer','is','10',7.8,7] returns [7,7,7]
              */
 
              int[] result = { 0 };
              System.out.println("End of getMiddleIntegers");
              return result;
 
       }
 
       private static List<String> filterString(String[] input, String filterOut) {
              /*
              * Please use Java 8 - Streams to filter the input. For example: the
              * input ["This", "is", "a", "test", "program", ".", "This", "is", "a",
              * "test", "pass"] Should give the output list with the elements:
              * "This", "is", "a", "program." "This", "is", "a", "pass"
              */
              List<String> output = null;
 
              // Java 8 idiom to print the output List
 
              System.out.println("End of filterString");
              return output;
       }
 
       public static Object[] reverseArray(Object[] a) {
              /*
              * Please implement this method to return a new array where the order of
              * elements has been reversed from the original array.
              */
 
              /**
              * Solution 1 ****************************************** To reverse an
              * int array, you swap items up until you reach the midpoint, like this.
              * The way you are doing it, you swap each element twice, so the result
              * is the same as the initial list.
              ********************************************/
              for (int i = 0; i < a.length / 2; i++) {
                     Object temp = a[i];
                     a[i] = a[a.length - i - 1];
                     a[a.length - i - 1] = temp;
              }
              printArray("Reverse an array:", a, a.length);
 
              /****
              * Solution 2 ************** IMport Commons.Lang
              ************************/
              // arr = ArrayUtils.reverse(a);
 
              /*****
              * Solution 3 ****************
              *
               */
              List<Object> list = Arrays.asList(a);
              Collections.reverse(list);
              // System.out.println("Reverse solution 2, reverse it back:");
              // printArray(a, a.length);
 
              /****
              * Solution 3 ********* swap the values at the left and right indices
              */
              for (int left = 0, right = a.length - 1; left < right; left++, right--) {
                     // swap the values at the left and right indices
                     Object temp = a[left];
                     a[left] = a[right];
                     a[right] = temp;
              }
 
              return null;
       }
 
       public static void sortIgnoringSpaces(String[] a) {
              /*
              * Please implement this method to sort a given array of Strings in
              * alphabetical order ignoring spaces (' ' symbols) within the strings.
              */
 
              /****
              * Solution 1 Strip out the spaced with a replaceAll() use the
              * compareTo() method.
              *****/
 
              /****
              * Solution 2
              *
               *****/
              // String.CASE_INSENSITIVE_ORDER.compare(o1.trim(), o2.trim());
              class SpaceInsensitiveComparator implements Comparator<String> {
                     public int compare(String o1, String o2) {
                           return String.CASE_INSENSITIVE_ORDER.compare(o1.trim(),
                                         o2.trim());
                     }
              }
       }
 
       public static boolean isPalindrome(String s) {
              /*
              * Definition: A palindrome is a string that reads the same forward and
              * backward. For example, "abcba" is a palindrome, "abab" is not. Please
              * implement this method to return true if the parameter is a palindrome
              * and false otherwise.
              */
 
              /***
              * Solution 1
              *
               */
              char[] word = s.toCharArray();
 
              int i1 = 0;
              int i2 = word.length - 1;
              while (i2 > i1) {
                     if (word[i1] != word[i2]) {
                           return false;
                     }
                     ++i1;
                     --i2;
              }
              return true;
 
       }
 
       public static void printUniqueElements(Set<Object> a, Set<Object> b) {
              /*
              * Please implement this method to print elements that can be found only
              * in set a or set b, but not in both Sets. The method should not change
              * the content of the parameters.
              */
 
              /****
              * Solution 1
              *
               */
              // remove intersection
              // for (Object inA : a)
              // if(b.contains(inA))
              // a.remove(inA);
 
              /*****
              * Solution 2
              */
              System.out.println(b.removeAll(a)); // true
              System.out.println(b); // [3]
 
              /****
              * Solution 3
              *
               */
              System.out.println(b.retainAll(a)); // true
              System.out.println(b); // [1]
       }
 
       public static void removeDuplicate(List<Employee> a) {
              /*
              * Please implement this method to Identify and eliminate duplicate
              * <Employee> objects
              */
 
              /****
              * Solution 1
              *
               * If you don't want duplicates in a Collection, you should consider why
              * you're using a Collection that allows duplicates. The easiest way to
              * remove repeated elements is to add the contents to a Set (which will
              * not allow duplicates) and then add the Set back to the ArrayList:
              */
              List<Employee> al = new ArrayList<Employee>();
              // add elements to al, including duplicates
              Set<Employee> hs = new HashSet<Employee>();
              hs.addAll(al);
              al.clear();
              al.addAll(hs);
 
       }
 
       class Employee {
              private String firstName;
              private String lastName;
              private Date dob;
 
       }
 
       public static void printCorrectChange(int pennies) {
              /*
              * Please implement this method to take cents as a parameter and print
              * an equal amount in dollars and coins using the minimum number of
              * coins possible. For example: 164 cents = 1 dollar, 2 quarters, 1 dime
              * and 4 cents. Return null if the parameter is negative.
              */
 
              int dollars = pennies / 100;
              pennies %= 100;
 
              int quarters = pennies / 25;
              pennies %= 25;
 
              int dimes = pennies / 10;
              pennies %= 10;
 
              int nickels = pennies / 5;
              pennies %= 5;
 
              System.out
                           .println(String
                                         .format("Dollars = %d\nQuarters = %d\nDimes = %d\nNickels = %d\nPennies = %d",
                                                       dollars, quarters, dimes, nickels, pennies));
 
       }
 
       /*
       * Debug this program and fix/implement the following 1. "add" method is
       * running in infinite loop 2. Implement "reverse" method to reverse this
       * linked list
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
 
       // //// start countWaysToJump ////////
 
       public static int countWaysToJump(int N) {
              /*
              * A set of stairs has N steps. You can jump either 1 or 2 steps at a
              * time. For example, if the stairs is N=4 steps, you can reach the end
              * in 5 possible ways: 1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2 Please
              * implement this method to return the count of the different ways to
              * reach the end of the stairs with N steps.
              */
 
              /*********
              * Solution 1
              *
               * 1.At first position we can have three numbers 1 or 2 or 3. 2.First
              * put 1 at first position and recursively call for n-1. 3.Then put 2 at
              * first position and recursively call for n-2. 4.Then put 3 at first
              * position and recursively call for n-3. 5.If n becomes 0 then we have
              * formed a combination that compose n, so print the current
              * combination.
              */
 
              return 0;
       }
 
       // static void printCompositions(int arr[], int n, int i)
       // {
       // int MAX_POINT = 3;
       // if (n == 0)
       // {
       // printArray(arr, i);
       // }
       // else if(n > 0)
       // {
       // for (int k = 1; k <= MAX_POINT; k++)
       // {
       // arr[i]= k;
       // printCompositions(arr, n-k, i+1);
       // }
       // }
       // }
       // // Utility function to print array arr[]
       // static void printArray(int arr[], int m)
       // {
       // for (int i = 0; i < m; i++)
       // System.out.print(arr[i] + " ");
       // System.out.println();
       // }
 
       // ////end countWaysToJump ////////
 
       // Utility function to print array arr[]
       static void printArray(String what, Object arr[], int m) {
              System.out.print(what + " ");
              for (int i = 0; i < m; i++)
                     System.out.print(arr[i] + ", ");
              System.out.println();
       }
 
       /* Problems End here... */
}
 
 
