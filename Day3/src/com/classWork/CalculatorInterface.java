package com.classWork;

public interface CalculatorInterface {
	
	public  void sub(int a, int b);   //by default abstract
	public  void mul(int a, int b);
	public  void div(int a, int b);
	public  void add(int a, int b);
	public  void pow(int a, int b);
	public  void sqrt(int a);
	public default void newMethodAdded() {  //No need to implement in MyInterfaceCalculator
		System.out.println("Hello froom new Method");  //Can be overriden in the child class
	}
	public static void newStaticMethodAdded() {  //No need to implement in MyInterfaceCalculator
		System.out.println("Hello froom new Static Method");  //Can be used without objects and direct call with interface
		}
}
