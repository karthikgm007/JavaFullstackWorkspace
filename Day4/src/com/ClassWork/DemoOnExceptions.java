package com.ClassWork;

public class DemoOnExceptions {

	public static void main(String[] args) {
		
		int numr=7, denr=0;
		
		try {
			
			System.out.println(numr/denr);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		catch(RuntimeException re) {
			re.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("close the resourses finally");
		}
		
		
		
		doDiv(5,0);
		
		
		System.out.println("End of main block");
	}
	
	public static void doDiv(int a, int b) {
		
		if(b==0) throw new ArithmeticException();
		
	}
}
