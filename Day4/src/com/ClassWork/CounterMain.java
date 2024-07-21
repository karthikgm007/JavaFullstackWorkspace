package com.ClassWork;

public class CounterMain extends Thread {
	
	CounterClass cc;
	
	public CounterMain() {
		super();
	}
	
	
	public CounterMain(CounterClass cc) {
		super();
		this.cc = cc;
	}


	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(currentThread().getId());
			cc.updateCount();
			try {
				sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
//		super.run();
	}
	
	public static void main(String[] args) {

		CounterClass cc= new CounterClass();
		CounterMain cm1 = new CounterMain();
		CounterMain cm2 = new CounterMain();
		
		cm1.start();
		cm2.start();

		
	}

	

}
