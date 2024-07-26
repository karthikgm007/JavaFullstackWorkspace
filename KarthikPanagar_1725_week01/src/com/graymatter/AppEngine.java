package com.graymatter;

import java.time.LocalDate;
import java.util.Scanner;

public class AppEngine implements UserInterface {

    private Student[] studentList = new Student[20];
    private Course[] courseList = new Course[10];
    private Enroll[] enrollmentList = new Enroll[50];
    private int i = 0;
    private int j = 0;
    private int k = 0;

    public void introduce(Course course) {
        courseList[j] = course;
        j++;
        System.out.println("Course Added");
    }

    public void register(Student student) {
        studentList[i] = student;
        i++;
        System.out.println("Student Added");
    }

    public Student[] listOfStudents() {
        return studentList;
    }

    public Course[] listOfCourses() {
        return courseList;
    }

    public void enroll(Student student, Course course) {
        enrollmentList[k] = new Enroll(student, course, LocalDate.now());
        k++;
    }

    public Enroll[] listOfEnrollments() {
        return enrollmentList;
    }

    @Override
    public void showFirstScreen() {
        System.out.println("Welcome to SMS (Student Management System) v1.0");
        System.out.println("Tell us who you are : \n1. Student\n2. Admin");
        System.out.println("Enter your choice (1 or 2): ");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                showStudentScreen();
                break;
            case 2:
                showAdminScreen();
                break;
            default:
                System.out.println("Invalid choice.");
                showFirstScreen();
                break;
        }
    }

    @Override
    public void showStudentScreen() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome, Student!");
        System.out.println("1. Register Student");
        System.out.println("2. View Courses");
        System.out.println("3. Enroll in Course");
        System.out.println("4. Exit");

        int op = sc.nextInt();
        switch (op) {
            case 1:
                showStudentRegistrationScreen();
                showStudentScreen(); 
                break;
            case 2:
                showAllCoursesScreen();
                break;
            case 3:
                enrollStudentInCourse(sc);
                break;
            case 4:
                showFirstScreen(); // Go back to the first screen
                break;
            default:
                System.out.println("Invalid choice. Back to main screen.");
                showFirstScreen();
                break;
        }
    }

    @Override
    public void showAdminScreen() {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Welcome, Admin!");
            System.out.println("1. Add Students");
            System.out.println("2. Add Courses");
            System.out.println("3. View All Students");
            System.out.println("4. View All Courses");
            System.out.println("5. Exit");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    showStudentRegistrationScreen();
                    showStudentScreen(); 
                    break;
                case 2:
                    introduceNewCourseScreen();
                    showStudentScreen(); 
                    break;
                case 3:
                    showAllStudentsScreen();
                    break;
                case 4:
                    showAllCoursesScreen();
                    break;
                case 5:
                	 showFirstScreen(); // Go back to the first screen
                     break;                
                 default:
                    System.out.println("Invalid choice. Back to main screen.");
                    break;
            
        }
    }

    @Override
    public void showAllStudentsScreen() {
        System.out.println("List of all students:");
        for (Student student : studentList) {
            if (student != null) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", DOB: " + student.getDob());
            }
        }
    }

    @Override
    public void showStudentRegistrationScreen() {
        System.out.println("Enter Student Details: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Date of Birth (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(scanner.nextLine());

        Student student = new Student(id, name, dob);
        register(student);
    }

    @Override
    public void introduceNewCourseScreen() {
        System.out.println("Enter Course Details: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Duration (in weeks): ");
        int duration = scanner.nextInt();
        System.out.print("Fees: ");
        double fees = scanner.nextDouble();

        Course course = new Course(id, name, duration, fees);
        introduce(course);
    }

    @Override
    public void showAllCoursesScreen() {
        System.out.println("List of all courses:");
        for (Course course : courseList) {
            if (course != null) {
                System.out.println("ID: " + course.getId() + ", Name: " + course.getName() + ", Duration: " + course.getDuration() + " weeks, Fees: $" + course.getFees());
            }
        }
    }


    private void enrollStudentInCourse(Scanner sc) {
        System.out.println("Select a course to enroll in:");
        showAllCoursesScreen();
        System.out.print("Enter Course ID: ");
        int courseId = sc.nextInt();
        Course selectedCourse = null;
        for (Course course : courseList) {
            if (course != null && course.getId() == courseId) {
                selectedCourse = course;
                break;
            }
        }
        if (selectedCourse != null) {
            System.out.println("Enter Student ID to enroll: ");
            int studentId = sc.nextInt();
            Student selectedStudent = null;
            for (Student student : studentList) {
                if (student != null && student.getId() == studentId) {
                    selectedStudent = student;
                    break;
                }
            }
            if (selectedStudent != null) {
                enroll(selectedStudent, selectedCourse);
                System.out.println("Enrollment successful!");
            } else {
                System.out.println("Student with ID " + studentId + " not found.");
                showStudentScreen(); 
            }
        } else {
            System.out.println("Course with ID " + courseId + " not found.");
            showStudentScreen(); 
        }
    }
}

