package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoOnArrayList {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		

		Employee e1 = new Employee("karthik", 3, 30000d, "bengaluru");
		Employee e2 = new Employee("harsha", 2, 40000d, "Delhi");
		Employee e3 = new Employee("naman", 5, 33000d, "bengaluru");
		Employee e4 = new Employee("dhanya", 1, 50000d, "bengaluru");
		Employee e5 = new Employee("thomas", 6, 67000d, "Delhi");
		Employee e6 = new Employee("milton", 7, 70000d, "Delhi");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		System.out.println(empList);
		System.out.println("Using for each");
		for(Employee e: empList) {
			System.out.println(e);
		}
		
		
		System.out.println("Using Iteratror");
		Iterator<Employee> iterator = empList.iterator(); 

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Sorting operation");
		
		//Collections sort for User defined objectss
		//Collections.sort(empList);
		
		
		System.out.println(empList);
		
		//based on Name ND Salary with comparator.
		empList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new salaryComparator()));
		System.out.println("After sort:");
		for(Employee e: empList) {
			System.out.println(e);
		}
		
	}

}
