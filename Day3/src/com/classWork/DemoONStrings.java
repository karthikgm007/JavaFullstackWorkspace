package com.classWork;

import java.util.Arrays;
import java.util.StringJoiner;

public class DemoONStrings {
	
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		System.out.println(s1.hashCode());
		
		String s2 = new String("Hello");
		System.out.println(s2.hashCode());
		
		String str = "Hello";
		System.out.println(str.hashCode());
		
		str = "Hyy";
		System.out.println(str.hashCode());
		
		//length
		System.out.println(str.length());
		
		//UpperCase
		System.out.println(str.toUpperCase());
		
		//Concat
		System.out.println(s1.concat(str));
		
		//Equality
		System.out.println(s1.equals(s2));

		//Remove leading and trailing spaces
		String s3 = "   Gelooo   ";
		System.out.println(s3.trim());  //lTrim()  rTrim()
 

		//last and first index
		System.out.println(s1.lastIndexOf('e'));
		
		//Replace
		System.out.println(s1.replace('H', 'c'));
		
		//Compare
		s1 = "apple";
		s2 = "call";
		System.out.println(s1.compareTo(s2));  //call < apple = s2 - s1

		//ends With string
		System.out.println(s1.endsWith("le"));
		
		//Split
		String s4 = "hello this is gray matter";
		String[] sArr = s4.split(" ");
		
		System.out.println(Arrays.toString(sArr));
 		
		
		 StringJoiner jnr = new StringJoiner(",");  
		 
		 
		//MUTABLE STRINGS
		//STRING BUFFER
		
		StringBuffer sbf = new StringBuffer();
		StringBuffer sbf1 = new StringBuffer(50);
		StringBuffer sbf2 = new StringBuffer("  Heuhsdaoi");
		
		System.out.println(sbf.hashCode());
		
		//append
		sbf.append("aaaaaa");
		System.out.println(sbf.hashCode());       //same memory location
		
		
		//Check capacity
		System.out.println(sbf.capacity());

		//convert to string
		String s = sbf.toString();
		
		sbf.setCharAt(2, 'o');
		System.out.println(sbf);
		
		
		
		

		
		
		
	}
}
