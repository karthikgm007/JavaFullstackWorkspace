package com.grayMatter;

import java.util.Scanner;

public class checkPrime {

	public static void main(String args[]) {
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		int i = 2;
		while(i<Math.sqrt(a)) {
			if(a%i == 0) {
				flag = false;
				break;
			}
			i++;
		}
		
		if(flag == true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
	}
}
