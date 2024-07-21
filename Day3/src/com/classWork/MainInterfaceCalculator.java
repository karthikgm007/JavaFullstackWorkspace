package com.classWork;

public class MainInterfaceCalculator implements CalculatorInterface, MyScientificCalculatorInterface {  //Multiple INheritance

	public static void main(String[] args) {

		
		CalculatorInterface ci = new MyInterfaceCalculator();
		MyInterfaceCalculator mci = new MyInterfaceCalculator();
		
		ci.add(5, 7);
		
		MyScientificCalculatorInterface msi =  new MainInterfaceCalculator();
		msi.pow(4,5);
		
		MainInterfaceCalculator mc = new MainInterfaceCalculator();
		mc.add(3, 4);
		mc.sqrt(44);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sqrt(int a) {
		// TODO Auto-generated method stub
		
	}

	

}
