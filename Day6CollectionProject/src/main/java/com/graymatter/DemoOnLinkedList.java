package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	
	public static void main(String[] args) {
//		LinkedList<String> fruitList = new LinkedList<String>();
//		
//		fruitList.add("Orange");
//		fruitList.add("Banana");
//		fruitList.add("Apple");
//		fruitList.add("Mango");
//		fruitList.add("Watermelon");
//		//fruitList.add(null);  cannot sort null
//		
//		System.out.println(fruitList);
//		//Using Iterators
//		Iterator<String> itr = fruitList.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		//Sorting
//		Collections.sort(fruitList);
//		System.out.println(fruitList);
//		
//		//Contains
//		System.out.println(fruitList.contains("Apple"));
//		
//		LinkedList<String> newList = (LinkedList<String>) fruitList.clone();
//		
//		System.out.println(fruitList.hashCode());
//		System.out.println(newList.hashCode());
//
//		newList.add("Pineapple");
//		System.out.println(newList.hashCode());

//		LinkedList<Employee> empList = new LinkedList<Employee>();
//		
//
//		Employee e1 = new Employee("karthik", 3, 30000d, "bengaluru");
//		Employee e2 = new Employee("harsha", 2, 40000d, "Delhi");
//		Employee e3 = new Employee("naman", 5, 33000d, "bengaluru");
//		Employee e4 = new Employee("dhanya", 1, 50000d, "bengaluru");
//		Employee e5 = new Employee("thomas", 6, 67000d, "Delhi");
//		Employee e6 = new Employee("milton", 7, 70000d, "Delhi");
//		
//		empList.add(e1);
//		empList.add(e2);
//		empList.add(e3);
//		empList.add(e4);
//		empList.add(e5);
//		empList.add(e6);
//		
//		LinkedList<Employee> myEmps = (LinkedList<Employee>) empList.clone();
//		
//		Employee e7 = new Employee("Hello", 22, 33020, "Delhi");
//		myEmps.add(e7);
//		System.out.println(e7);
		
		LinkedList<Item> itemList = new LinkedList<Item>();
		
		Item i1 = new Item("car3", 2, 3, "bmw8");
		Item i2 = new Item("car1", 2, 3, "bmw3");
		Item i3 = new Item("car2", 2, 3, "bmw1");
		Item i4 = new Item("car4", 2, 3, "bmw5");
		Item i5 = new Item("car6", 2, 3, "bmw2");
		Item i6 = new Item("car4", 2, 3, "bmw4");

		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3);
		itemList.add(i4);
		itemList.add(i5);
		itemList.add(i6);

		itemList.sort(new ItemNameComparator().thenComparing(new BrandComparator()));
		
		for(Item i: itemList) {
			System.out.println(i);
		}
		
	}

}
