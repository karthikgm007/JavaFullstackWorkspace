package com.ClassWork;

public class DemoOnThreads extends Thread{

	
	@Override
	public void run() {
		super.run();
		System.out.println("from run method");
//		System.out.println(currentThread().getName());
//		System.out.println(currentThread().getId());
		
		for(int i=1; i<5;i++) {
			System.out.println(currentThread().getId() + " " + i);
		}
	}
	
	public static void main(String[] args) {

	
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(currentThread().isAlive());
		System.out.println(currentThread().isDaemon());

		DemoOnThreads dot = new DemoOnThreads();	//Creates a Thread
		DemoOnThreads dot1 = new DemoOnThreads();
		dot.start();		//Order of execution is variable and sequence is unknown
		dot1.start();
		
		
	}

}
