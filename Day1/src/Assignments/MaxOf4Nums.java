package Assignments;

import java.util.Scanner;

public class MaxOf4Nums {

	public static void main(String[] args) {

		
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();
        
        System.out.print("Enter fourth number: ");
        int n4 = scanner.nextInt();
        
	    //Using if else 
		if(n1>n2 && n1>n3 && n1>n4) {
			System.out.println(n1+ " is greatest");
		} else if(n2>n1 && n2>n3 && n2>n4) {
			System.out.println(n2+ " is greatest");
		} else if(n3>n1 && n3>n2 && n3>n4) {
			System.out.println(n3+ " is greatest");
		} else {
			System.out.println(n4+ " is greatest");
		}
	
		//Using ternary operators
		int max = (n1 > n2 && n1 > n3 && n1 > n4) ? 
	               n1 : ((n2 > n3 && n2 > n4) ? 
	               n2 : (n3 > n4 ? n3 : n4));
		
		System.out.println("Max using ternary operators is: " + max);
	}

}
