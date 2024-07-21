package com.ClassWork;

public class MainClass {
	
	public static void main(String[] args) {
		
		School sc = new School("KV", "blore");
		
		Student s1 = new Student("kas", 3);
		Student s2 = new Student("kas", 3);
		Student s3 = new Student("kas", 3);
		Student st[] = {s1, s2, s3};
		
		ClassRoom c = new ClassRoom(7,4,st);
		
		
		System.out.println();
		
		
		
		
		
		
		
//		ClassRoom c1 =  new ClassRoom(3,2);
//		ClassRoom c2 =  new ClassRoom(5,1);
//		
//		ClassRoom[] cArr = {c1, c2};
		
		//This doesnt delete classrooms if schools is deleted Hence Aggregation
		//School s1 = new School("VHS", "Bellandur", cArr);
		
		
		
		
		
	}
	
	//GARBAGE COLLECTION
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Manual invoke finalize");
		System.gc();
	}
}
