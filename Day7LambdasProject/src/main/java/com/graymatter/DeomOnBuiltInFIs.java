package com.graymatter;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import jdk.internal.joptsimple.internal.Strings;

public class DeomOnBuiltInFIs {
	public static void main(String[] args) {
		Consumer<Integer> consumer = i -> System.out.println(i);
		consumer.accept(33);
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		aList.add(56);
		aList.add(78);
		aList.add(44);
		aList.add(34);
		aList.add(56);
		aList.add(78);
		aList.add(44);
		aList.add(34);
		aList.forEach(consumer);
		
		//Supplier
		Supplier<String> supplier = () -> "hello";
		supplier.get();
		System.out.println(supplier.get());
		
		//Predicate
		Predicate<Integer> predicate = (num) -> num%2==0;
//		Integer num=98;
//		System.out.println(predicate.test(num));
		
		int[] arr = {15,34,56,77,89,12};
		
		for(int i: arr) {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		}

		//FUnctional Interface
		Function<Integer, Integer> function = (num) -> {
			int fact = 1;
			for(int i=1; i<=num; i++) {
				fact*=i;
			}
			return fact;
		};
		
		System.out.println(function.apply(5));
		
	
	}
}
