package com.grayMatter;

import java.util.Scanner;

public class CalculatorUsingIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b;
		char op;
		
		System.out.println("Enter two nums for calculator");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter Operator");
		op = sc.next().charAt(0);
		
		switch (op) {
		case '+' :
			 System.out.println("Answer = " + (a+b));
			 break;
		case '-' :
			 System.out.println("Answer = " + (a-b));
			 break;
		case '*' :
			 System.out.println("Answer = " + (a*b));
			 break;
		case '/' :
			 System.out.println("Answer = " + ((float)a/b));
			 break;
		default:
			System.out.println("Invalid operator");
			 
		}
			

	
	}

}
