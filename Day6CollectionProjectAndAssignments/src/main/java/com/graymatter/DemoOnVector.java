package com.graymatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		
		//vector is a resizable array and a legacy class
		//init cap = 10
		//doubling cap when full
		
		System.out.println(vector.capacity());
		
		for(int i=10; i>0; i--)
			vector.add(i);	
		
		//Capacitry of vector
		System.out.println(vector.capacity());
		vector.add(11);
		System.out.println(vector.capacity());
		
		//Using Enumaeration
		Enumeration<Integer> myEnum = vector.elements();
		while (myEnum.hasMoreElements()) {
			int i = myEnum.nextElement();
			if(i==6) {
				System.out.println("concurrent modn not possible");
			}
			System.err.println(i);
		}
		
		//Using Iterator on vector
		Iterator<Integer> itr = vector.listIterator();
		while(itr.hasNext()){
			int i = itr.next();
			if(i==6) {
				itr.remove();
			}
			System.out.println(i);
		}
		
		System.out.println(vector);
		
		System.out.println(vector.contains(2));
		
		Collections.sort(vector);
		System.out.println(vector);
		
		List<Integer> newList2 = Arrays.asList(1,2,3,4,7,5,42);
		vector.addAll(newList2);
		System.out.println(vector);
		
		
		
		
	}
}
