package com.ClassWork;

public class DemoOnWrapper {

	int i = 67;
	
	//int to Obj
	Integer iObj = (Integer) i;
	
	//Obj to int
	int j = iObj; //OR iObj.intValue;
	
	char c = 'm';
	Character cObj = (Character) c;
	
	//String to Integer/Wrapper
	String sInt = "123";
	int  k = Integer.parseInt(sInt);
	
	//Integer/Wrapper to String 
	Integer i1 = 3;
	String s = i1.toString();
	
	
	//UPCASTING
	String str = "Hello";  //child -> parent - implicit
	Object o = str;
	
	//Downcasting
	String s1 = (String) o;  //parent to child - explicit


}
