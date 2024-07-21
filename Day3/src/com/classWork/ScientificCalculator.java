package com.classWork;

public class ScientificCalculator extends ArithmaticCalculator {

	@Override
	public void pow(int a, int b) {
		System.out.println(Math.pow(a, b));
	}

	@Override
	public void sqrt(int a) {
		System.out.println(Math.sqrt(a));
	}

}
