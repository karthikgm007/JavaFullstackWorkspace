package com.grayMatter;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter number for table");
		int a = sc.nextInt();
		
		for(int i=1; i<50; i++ ) {
			if(i%3==0) continue;
			
			System.out.println(a + "X" + i + "=" + (a*i));
		}
	}

}
