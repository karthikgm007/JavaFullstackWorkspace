package com.graymatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoOnStreams {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3,4,5);
		//OR
		Integer[] arr = {1,2,3,4,5,1,2,3,4,5};
		
		 List<Integer> list1 = Arrays.stream(arr)  //stream generation
		.limit(10)
		.filter(i->i%2==0)	//intermediate operation
		.map(i -> i+10)
//		.forEach(i -> System.out.println(i));  //terminal operation
		.collect(Collectors.toList());
		
		 System.out.println(list1);
		
		 ArrayList<String> aList = new ArrayList<String>();
		
		 aList.add("aaae");
		 aList.add("bbbe");
		 aList.add("aaa");
		 aList.add("bbbe");
		 aList.add("ccce");
		 aList.add("ddde");
		 
		 aList.stream()
		 .distinct()
		 .skip(2)
		 .filter(i -> i.endsWith("e"))
		 .map(i -> i.toUpperCase())
		 .forEach(i -> System.out.println(i));
		 
		 System.out.println(Arrays.stream(arr).skip(5).reduce(0, (a,b)->a+b));
		 
		 Integer[] arr1 = {1,2,3,4,5};
		 
		 Arrays.stream(arr)
		 .map(i-> {
			 int f = 1;
			 for(int j=1; j <=i; j++) {
				 f*=j;
			 }
			 return f;
		 }).forEach(i->System.out.println(i));
		 
		 ArrayList<String> aList1 = new ArrayList<String>();
			
		 aList1.add("aaaewe");
		 aList1.add("bbbe");
		 aList1.add("aawew");
		 aList1.add("bbbwwe");
		 aList1.add("ccce");
		 aList1.add("dddwee");
		
		 aList1.stream()
		 .filter(i -> i.length()>5)
		 .map(s-> s.toUpperCase())
		 .forEach(i -> System.out.println(i));
		 
		 
		 System.out.println(Arrays.stream(arr).mapToInt(i->i).sum());
		 System.out.println(Arrays.stream(arr).mapToInt(i->i).max());
		 System.out.println(Arrays.stream(arr).mapToInt(i->i).min());
//		 System.out.println(Arrays.stream(arr).mapToInt(i->i).sorted().forEach(i -> System.out.println(i)));

		 List<Integer> numbers = Arrays.asList(10, 5, 8, 30, 15, 25);

	        // Finding second largest
	        Integer secondLargest = numbers.stream()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst()
	                .orElseThrow(() -> new RuntimeException("Less than 2 elements in the list"));

	        // Finding second smallest
	        Integer secondSmallest = numbers.stream()
	                .sorted()
	                .skip(1)
	                .findFirst()
	                .orElseThrow(() -> new RuntimeException("Less than 2 elements in the list"));

		 
		 
		
	}

}
