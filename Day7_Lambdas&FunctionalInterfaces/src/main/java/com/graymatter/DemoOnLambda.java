package com.graymatter;


interface HelloInterface {

	public String sayHello();
}

@FunctionalInterface
interface printNameInterface{
	public void printName(String name);
}

@FunctionalInterface
interface AdditionInterface{
	public int  add(int a, int b);
}

interface DisplayInterface{
	public void display();
}

public class DemoOnLambda{
	public static void main(String[] args) {
		
//		HelloInterface hi = new DemoOnLambda();
//		System.out.println(hi.sayHello());
		
//		HelloInterface hi = () -> {
//			return "Hello...";
//		}
	
		HelloInterface hi = () -> "Hello...";  //no param with return
		hi.sayHello();
		
		printNameInterface pni = (name) -> System.out.println(name);
		pni.printName("MyName");
		
		AdditionInterface adi = (a, b) -> a+b;  //parameters with return
		System.out.println(adi.add(2, 3));
		
		DisplayInterface di = ()-> System.out.println("from display interface"); //no param no return
		di.display();
		
	}
	
//	@Override
//	public String sayHello() {
//		
//		return "Hello..";
//	}
}