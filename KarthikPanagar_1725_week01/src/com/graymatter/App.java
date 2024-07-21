package com.graymatter;

import java.time.LocalDate;
import java.util.Scanner;

public class App {

	
	
	public static void scenario1() {
		
		
		Student s1 = new Student(1, "karthik", LocalDate.of(2001, 4, 9));
		Student s2 = new Student(1, "harsha", LocalDate.of(2002, 7, 1));
		Student s3 = new Student(1, "shrutha", LocalDate.of(2002, 2, 19));
		Student s4 = new Student(1, "naman", LocalDate.of(2002, 2, 19));
		
		Info i1 = new Info();
		i1.display(s1);
		i1.display(s2);
		i1.display(s3);
		i1.display(s4);
		
	}
	
	public static void scenario2() {
			
		Student s1 = new Student(1, "karthik", LocalDate.of(2001, 4, 9));
		Student s2 = new Student(1, "harsha", LocalDate.of(2002, 7, 1));
		Student s3 = new Student(1, "shrutha", LocalDate.of(2002, 2, 19));
		Student s4 = new Student(1, "naman", LocalDate.of(2002, 2, 19));
		
		Student[] studentArray = {s1, s2, s3, s4};
		
		Info i1 = new Info();
		
		for(Student s:studentArray) {
			i1.display(s);
		}
		}
		
	public static void scenario3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students to be added: ");
        int numOfStudents = scanner.nextInt();
        
        Student[] studentArray = new Student[numOfStudents];
        
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Enter details of Student " + (i + 1) + ":");
            
            System.out.print("iD: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Birthdate (yyyy-mm-dd): ");
            LocalDate birthdate = LocalDate.parse(scanner.nextLine());
            
            studentArray[i] = new Student(id, name, birthdate);
        }
        
        scanner.close();
        
        Info i1 = new Info();
        for (Student s : studentArray) {
            i1.display(s);
        }
    }

	
	public static void main(String[] args) {

//		App app = new App();
//		app.scenario1();
//		app.scenario2();
//		app.scenario3();
		
//		AppEngine ae = new AppEngine();
//		
//		 Course c1 = new Course(1, "Java Programming", 30, 199.99);
//	     Course c2 = new Course(2, "Python Programming", 25, 149.99);
//		
//	     ae.introduce(c1);
//	     ae.introduce(c2);
//	     
//	     Student student1 = new Student(1, "karthik", LocalDate.of(2000, 5, 15));
//	     Student student2 = new Student(2, "harsha", LocalDate.of(2001, 8, 25));
//		
//
//        ae.register(student1);
//        ae.register(student2);
//        
//        System.out.println("\nList of Students:");
//        Student[] students = ae.listOfStudents();
//        for (Student student : students) {
//            if (student != null) {
//                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Birthdate: " + student.getDob());
//            }
//        }
//        
//        System.out.println("\nList of Courses:");
//        Course[] courses = ae.listOfCourses();
//        for (Course course : courses) {
//            if (course != null) {
//                System.out.println("ID: " + course.id + ", Name: " + course.name + ", Duration: " + course.duration + ", Fees: $" + course.fees);
//            }
//        }
//        
//        
//        // Test enroll(Student student, Course course) method
//        ae.enroll(student1, c1);
//        ae.enroll(student2, c2);
//
//        // Test listOfEnrollments() method
//        System.out.println("\nList of Enrollments:");
//        Enroll[] enrollments = ae.listOfEnrollments();
//        for (Enroll enrollment : enrollments) {
//            if (enrollment != null) {
//                System.out.println("Student: " + enrollment.getStudent().getName() + " enrolled in " + enrollment.getCourse().name + " on " +  enrollment.getEnrollmentDate() );
//            }
//        }
		
		AppEngine ae = new AppEngine();
		ae.showFirstScreen();
		//added comment 
		
	}
	

}
