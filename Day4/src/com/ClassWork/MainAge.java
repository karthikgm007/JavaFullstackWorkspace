package com.ClassWork;

public class MainAge {

	public static void main(String[] args) throws AgeNotSufficientException {
		
		Person p = new Person("kad", 2222, 12);
		
		if(p.getAge() <18) {
			throw new AgeNotSufficientException("Person age need to be greater than or equal to 18");
		}
		else {
			System.out.println("Age sufficient");
			System.out.println(p);
		}
	}
}
