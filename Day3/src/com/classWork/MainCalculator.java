package com.classWork;

public class MainCalculator {

	public static void main(String[] args) {

		ScientificCalculator sc = new ScientificCalculator();
		sc.pow(2, 3);
		
//		ArithmaticCalculator ac = new ArithmaticCalculator();  Not possible as abstract
		ArithmaticCalculator ac = new ScientificCalculator();  //accessing thru childs object class
		
		ac.pow(3, 3);
		
		
	}

}
