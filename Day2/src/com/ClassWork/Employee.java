package com.ClassWork;

import java.util.Date;

public class Employee extends Person {
	
	private String deptName;
	private double sal;
	private Date doj;
	
	
	public Employee(String name, int id, String mobile, String email, Date dob, String deptName, double sal, Date doj) {
		super(name, id, mobile, email, dob); //calling parent constructor
		this.deptName = deptName;
		this.sal = sal;
		this.doj = doj;
	}


	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", sal=" + sal + ", doj=" + doj + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
