package com.grayMatter;

public class EmployeeDriver {
	public static void main(String args[]) {
		
		Employee emp; //reference created in stack memory
		Employee emp1 = new Employee(); //Object created in Heap
		
		//Calling methods for the employee emp1
		emp1.setDetails();
		emp1.getDetails();
		
		Employee emp2 = new Employee("saasas", 22, 22222, "23213", "dfefs@gmail");
		emp2.getDetails();
		
	}
}
