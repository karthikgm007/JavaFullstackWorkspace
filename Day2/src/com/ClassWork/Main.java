package com.ClassWork;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee("karthik", 122, "7743737747", "sakjdnasjd@gmail.com", new Date("21/2/94"), "accounts", 50000, new Date("23/2/99"));
		System.out.println(e2);
		
		
		System.out.println(e1 instanceof Employee);
		System.out.println(e1 instanceof Person);
		
		Customer c1 = new Customer("kacj", 213, "3423432423", "asfaf@gmail.com", new Date("22/1/22"), 423432d, 233);
		System.out.println(c1);
	}

}
