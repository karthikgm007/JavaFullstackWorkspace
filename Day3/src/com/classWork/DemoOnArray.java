package com.classWork;

import java.util.Scanner;

public class DemoOnArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		int[] arr1 = {1,2,3};
		
		System.out.println("Enter array elements one after other");
		
		//Take input
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
	
		
//		lSearch(arr, 3);
//		bSearch(arr,3);
//		bubbleSort(arr);
//		
		insertElement(arr, 2, 7);
//		deleteElement(arr,1);
		
		}
		
	
			//isPrime
			public static boolean isPrime(int a) {
				
				boolean flag=true;
				
				int i=2;
				while(i<Math.sqrt(a)) {
					if(a%i == 0)
						flag = false;
					i++;
				}
				
				return flag;
			}
			
			//Find Element
			public static void lSearch(int[] arr, int tgt) {
				int i=0;
				for(; i<arr.length; i++) {
					if(arr[i]==tgt) {
						System.out.println("Element found at:" + (i+1));
						break;
					}
					if(i==arr.length-1)
					System.out.println("Element not found");
				}
			}
			
			//Binary Search
			public static void bSearch(int[] arr, int tgt) {
				int i=0;
				int j=arr.length-1;
				
				while(i<=j) {
					int mid = (i+j)/2;
					
					if(arr[mid]==tgt) {
						System.out.println("Element found at" + mid);
						break;
					}
					else if(arr[mid] < tgt ) {
						i = mid+1;
					}
					else {
						j = mid-1;
					}
				}
				if(i>j)
					System.out.println("Element Not found");
			}
			
			//Bubble sort
			public static void bubbleSort(int[] arr) {
				boolean flag=true;
				
				for(int j=0; j<arr.length; j++) {
					for(int i=0;i<arr.length-1;i++) {
						if(arr[i]>arr[i+1]) {
							int temp = arr[i];
							arr[i] = arr[i+1];
							arr[i+1] = temp;
							flag = false;
						}
					}
					if(flag==true)
						break;
				}
			}
			
			
			//Insert an element at a given position
			public static void insertElement(int[] arr, int el, int ind) {
				System.out.println("Before instertion");
				for(int i:arr) {
					System.out.print(i + " ");
				}
				
				
				if(ind<0) {
					System.out.println("Invalid index");
				}
				if(ind<arr.length) {
					for(int i=ind+1; i<arr.length-1;i++) {
						arr[i+1] = arr[i];
					}
					arr[ind] = el;
					return;
				}
				
				while(ind>=arr.length) {
					arr = resize(arr);
				}
				
				
				System.out.println("Inserted " + el + "at" + ind );
				
				for(int i:arr) {
					System.out.print(i + " ");
				}
				
			}
			
			private static int[] resize(int[] arr) {

				int[] arr2 = new int[arr.length+arr.length/2];
				
				for(int i=0; i<arr.length; i++) {
					arr2[i] = arr[i];
				}
				return arr2;
			}


			//Delete an element at a given position
			public static void deleteElement(int[] arr, int ind) {
							
				System.out.println("Before Deletion");
				for(int i:arr) {
					System.out.print(i + " ");
				}
				
				for(int i=ind; i<arr.length-1; i++) {
					arr[i] = arr[i+1];
				}
				
				System.out.println("Before Deletion");
				for(int i:arr) {
					System.out.print(i + " ");
				}
			}

			
			
			
			
			
}
 