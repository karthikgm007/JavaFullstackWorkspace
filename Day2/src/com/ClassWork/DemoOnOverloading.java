package com.ClassWork;

public class DemoOnOverloading {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	//Change on type of parameters
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	public void add(String a, String b) {
		System.out.println(a+b);
	}
	
	//Change on number of parameters
	public void add(float a, float b, float c) {
		System.out.println(a+b+c);
	}
	
	//Change in order of parameters
	public void add(int a, double b) {
		System.out.println(a+b);
	}
	public void add(double b, int a) {
		System.out.println(a+b);
	}
	
	//Overloading with user defined dts
	public void add(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		c.real = a.real + b.real;
		c.img = a.img + b.img;
		
		System.out.println( c.real + "+" + c.img + "i");
	}
	
	
	
	public static void main(String[] args) {

		DemoOnOverloading d1 = new DemoOnOverloading();
		
		d1.add(23, 24);
		d1.add(3.4f, 2.4f);
		d1.add("Hello ", "World");
		d1.add(23, 24);
		
		ComplexNumber c1 = new ComplexNumber(3, 4);
		ComplexNumber c2 = new ComplexNumber(5, 7);
		d1.add(c1, c2);
	}

}
