package com.classWork;

public class DEmoOnFunctionalInterface implements MyFunctionalInterface{
	
	public static void main(String[] args) {
		
		DEmoOnFunctionalInterface dof = new DEmoOnFunctionalInterface();
		System.out.println(dof.cubeOfNum(3));
		
		MyFunctionalInterface mfi = dof;
		System.out.println(mfi.cubeOfNum(4));
	}

	@Override
	public int cubeOfNum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

}
