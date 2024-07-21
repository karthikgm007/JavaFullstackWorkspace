package com.classWork;

public class MainDisplayInterface {
		
	public static void main(String[] args) {
		
		ImplementDisplayInterface mc = new ImplementDisplayInterface();  //Object of Interface implementing class
		
		mc.display();   //ambiguos on which INterface display is called from
		
		Interface1 i1 = mc;  //To call display from specific Interface
		i1.display();
		
		Interface1 i2 = mc;  
		i2.display();
		
		CalculatorInterface.newStaticMethodAdded();		//Calling static method using interface
		// CalculatorInterface ci = new MyInterfaceCalculator();  Not possible
		//mc.newStaticMethodAdded();  Not possible
	}
	
	
}
