package com.grayMatter;

import java.util.Scanner;

public class Conditionals {
	
	public static void main(String args[]) {
		
		boolean flag = true;
		//if else
		if(flag) {
			System.out.println("flag is true");
		}
		else {
			System.out.println("flag is false");
		}
		
		//Taking Input with Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nums for finding max");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//find max
		if(num1>num2) {
			System.out.println("num1 is max");
		}
		else {
			System.out.println("num2 is max");
		}
		
		//Check even odd
		System.out.println("Enter num for even odd check");
		int num3 = sc.nextInt();
		if(num3%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		//Find max of 3 nums
		System.out.println("Enter 3 nums to find max");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		if(a>b) {
//			if(b>c) {
//				System.out.println("a");
//			}
//			else {
//				System.out.println("c");
//			}
//		}
//		else {
//			if(b>c) {
//				System.out.println("b");
//			}
//			else {
//				System.out.println("c");
//			}
//		}
		
		if(a>b && b>c) {
			System.out.println("a");
		}
		else if(b>c && c>a) {
			System.out.println("b");
		}
		else
			System.out.println("c");
		}
	
	//Assignment of one to ten
	
	
}
