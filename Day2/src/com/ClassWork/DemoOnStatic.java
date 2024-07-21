package com.ClassWork;

public class DemoOnStatic {

	static {
		System.out.println("Static block 1");
	}
	static {
		System.out.println("Static block 2");
	}
	static {
		System.out.println("Static block 3");
	}
	
	public static void  sayHello() {
		System.out.println("Helloo I am static method");
	}
	
	public static void main(String[] args) {

		System.out.println("Inside Main meth");
		sayHello();	//OR
		DemoOnStatic.sayHello();
	}
	
	//Overloading main method without params //wont be called as no args
	public static void main() {
		System.out.println("empty Main ");
	}
	
	static {
		System.out.println("Static block 4");
	}

}
