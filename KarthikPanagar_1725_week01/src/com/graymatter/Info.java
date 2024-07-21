package com.graymatter;

public class Info {

	public void display(Student student) { 
		
		Student s = student;
		System.out.println( "Student Details: " + "Student [id=" + s.getId() + ", name=" + s.getName() + ", dob=" + s.getDob() + "]");
	} 
	
	public void display(Course course) { 
		Course c = course;
		System.out.println("Course [id=" + c.id + ", name=" + c.name + ", duration=" + c.duration + ", fees=" + c.fees + "]");
	} 
	
}
