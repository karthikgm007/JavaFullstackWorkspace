package com.grayMatter;

public class Basics {

	public static void main(String[] args) {

		int num1 = 8; 
		int num2 = 3;
		boolean flag = true; 
		
		//Arithmetic operators
		System.out.println("sum is equal to:" + (num1 + num2)); //11
		System.out.println("sum is equal to:" + (num1 - num2)); //5
		System.out.println("sum is equal to:" + (num1 * num2)); //24
		System.out.println("sum is equal to:" + ((float)num1 / num2)); //2.6666667
		System.out.println("sum is equal to:" + (num1 % num2)); //2
		
		
		int i=8;
		//Pre and Post Increment operator
		int j=i++; //j=8, i=9
		int k=++i; //k=9=i
		
		
		int a=3;
		int b=4;
		int c=6;
		
		//Ternary Operator
		//exp1 ? exp2 : exp3;
		System.out.println("Max of 2 =" + (a>b ? a:b));
		
		//Find max of 3 using ternary
		int ans1 = (a>b && a>c)?
					a:(b>c?
					b:c);
		int ans2 = a>b?
				   (a>c?a:c) : (b>c?b:c);
		
		//swap 3 number
		a = a+b+c;
		b = a - b - c;
		c = a - b - c;
		a = a - b - c;
		
		//check if even with ternary
		System.out.println(a%2==0 ? "even" : "odd"); //a=6 even
		
		i = 5;
		j = 3;
		
		//Bitwise operators
		System.out.println("AND = "+ (i&j)); //1
		System.out.println("OR = "+ (i|j)); //7
		
		int num = 60;
		System.out.println("Right Shift1: "+ (num>>1));
		System.out.println("Left Shift1: " + (num<<1));
		System.out.println("Right Shift3: "+ (num>>3));
		
		num = -60;
		System.out.println("Right Shift3: "+ (num>>3));  // -8 Solve
		
		//Similarly: ~, ^, &, |, >>, <<
		
		//TYPECASTING
		i = 6;
		//Widening: lower -> higher range (implicit)
		float f = i;
		
		float f1 = 5.7f;
		//Narrowing: higher -> lower range (explicit)
		i = (int)f1;
		
	}

}
