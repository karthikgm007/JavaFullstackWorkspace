package Assignments;

public class StudentDriver {
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		System.out.println("before init: "+ s1);
		
		s1.setStudName("std1");
		s1.setId(1);
		s1.setM1(50);
		s1.setM2(50);
		s1.setM3(55);
		
		//Getting details using toString
		System.out.println(s1);
		
		//using getters
		System.out.println(s1.getStudName());
		System.out.println(s1.getId());
		System.out.println(s1.getM1());
		
		Student s2 = new Student("std2", 122, 90, 80, 80);
		System.out.println(s2);
		
		Student s3 = new Student("std3", 22);
		System.out.println(s3);
		s3.setM1(33);
		s3.setM2(20);
		s3.setM3(12);
		
		//Assignment
		//calc results for s1, s2, s3
		System.out.println(s1.getResults());
		System.out.println(s2.getResults());
		System.out.println(s3.getResults());
		
		
	}
}
