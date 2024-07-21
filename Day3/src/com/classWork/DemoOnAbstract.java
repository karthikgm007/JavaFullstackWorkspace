package com.classWork;

public class DemoOnAbstract {

	public static void main(String[] args) {
		
		
		
		
//		ac.sayHello();  not possible
//		AbstractClass ac = new AbstractClass();
		
		AbstractChildClass acc = new AbstractChildClass();
		acc.sayHello();
		System.out.println(acc.printName("karthik"));
		
		
		
	}
}
