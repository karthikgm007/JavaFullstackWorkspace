package com.classWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoOnArrayList {

	public static void main(String[] args) {

		
		//Heterogenous Objects
		ArrayList al = new ArrayList();
		
		al.add(56);
		al.add("Hello");
		al.add(true);
		al.add(1.223d);
		
		al.add(56);
		al.add(null);
		
//		System.out.println(al); // uses toString()
//
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		for(int i: al) {
//			System.out.println(i);
//		}
		
		//Homogenous elements
		ArrayList<Integer> al1 =  new ArrayList<Integer>();
		
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(4, 55);
		
		System.out.println("Before remove at index 1 " + al1);
		al1.remove(1);
		System.out.println("After " + al1);
		al1.remove((Integer) 4); 
		System.out.println("After remove of first occurance of 4 " + al1);
		
		al1.clear();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		System.out.println(al1);
		
		//Loop Using Iterator
		Iterator<Integer> itr = al1.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");
		
		ListIterator<Integer> li = al1.listIterator();
		
		while(li.hasNext()) {
			if(li.next()%2==0) {
				li.add(-1);
			}
		}
		System.out.println(al1);
		
		Collections.sort(al1);
		System.out.println("After sort:" + al1);
	}

}
