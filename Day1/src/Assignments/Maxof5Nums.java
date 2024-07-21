package Assignments;

import java.util.Scanner;

public class Maxof5Nums {
	
	public static void main(String args[]) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter five numbers:");
	        int n1 = scanner.nextInt();
	        int n2 = scanner.nextInt();
	        int n3 = scanner.nextInt();
	        int n4 = scanner.nextInt();
	        int n5 = scanner.nextInt();
	        
	        //Using if else
	        if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) {
	            System.out.println(n1 + " is the greatest");
	        } else if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5) {
	            System.out.println(n2 + " is the greatest");
	        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 >= n5) {
	            System.out.println(n3 + " is the greatest");
	        } else if (n4 >= n1 && n4 >= n2 && n4 >= n3 && n4 >= n5) {
	            System.out.println(n4 + " is the greatest");
	        } else {
	            System.out.println(n5 + " is the greatest");
	        }
	        
	        //Using ternary Operators
	        int max = (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) ?
	                  n1 : (n2 > n3 && n2 > n4 && n2 > n5) ?
	                  n2 : (n3 > n4 && n3 > n5) ?
	                  n3 : (n4 > n5) ?
	                  n4 : n5;

	        System.out.println("Max using ternary operators is: " + max);

	}
}
