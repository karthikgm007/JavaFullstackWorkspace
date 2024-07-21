package com.ClassWork;

public class FinalClass {
	private final String name = "karthik";
	protected String companyName;
	
//	public void changeName(String name) {
//		this.name = name;    //final cannot be reassigned
//	}
	
//	public FinalClass(String name) {
//		this.name = name;
//	}
	
	//Check final prop, meth, class for inside InnerClasss
	
	public final void printCompanyDetails() {
		System.out.println(companyName);
	}
	

}
