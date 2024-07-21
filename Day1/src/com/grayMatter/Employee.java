package com.grayMatter;

import java.util.Scanner;


public class Employee {

	//Properties - Instance variables
	String name;
	int id;
	double sal;
	String mobile;
	String email;
	//Static - shared for all objects
	static String companyName = "GrayMatter";
	
	public Employee() {
		System.out.println("From def Constructor");
	}
	
	public Employee(String name, int id, double sal, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.mobile = mobile;
		this.email = email;
	}

	public void setDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name, id, sal, num, email");
		this.name = sc.next();
		this.id = sc.nextInt();
		this.sal = sc.nextDouble();
		this.mobile = sc.next();
		this.email = sc.next();
	}
	
	public void getDetails() {
		System.out.println( this.name +" "+ this.id + " "+ this.sal);
	}
}
