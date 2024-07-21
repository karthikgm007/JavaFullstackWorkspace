package com.ClassWork;

public class CounterClass {
	
	private int count=0;
	public void updateCount(){
		
		synchronized(this){
			count++;
			printCount();
		}
		
	}
	
	public void printCount() {
		System.out.println(count);
	}
	
	
	
	
	
	
}
