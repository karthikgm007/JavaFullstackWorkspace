package com.ClassWork;

public class OuterClass {

	static class InnerClass {
		String name;
		
	}
	
	public static void main(String[] args) {
		//if not static InnerClass
		//OuterClass.InnerClass i = new OuterClass().new InnerClass();
		InnerClass i = new InnerClass();
	}
}
