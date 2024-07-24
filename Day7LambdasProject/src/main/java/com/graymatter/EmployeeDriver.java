package com.graymatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeDriver {

	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", 1, 50000.0));
        employees.add(new Employee("Jane Smith", 2, 40000.0));
        employees.add(new Employee("Michael Johnson", 3, 35000.0));
        employees.add(new Employee("Emily Davis", 4, 52000.0));
        employees.add(new Employee("Robert Wilson", 5, 58000.0));
        employees.add(new Employee("Linda Brown", 6, 33000.0));
        employees.add(new Employee("David Lee", 7, 24000.0));
        employees.add(new Employee("Sarah Clark", 8, 24000.0));
        employees.add(new Employee("Daniel Hall", 9, 59000.0));
        employees.add(new Employee("Maria Garcia", 10, 57000.0));

        Function<Employee, Double> function = (e) -> {
			if(e.getSalary()>=50000) {
				return 5000.0;
			}
			else
				return 2000.0;
		};
		
		employees.forEach((e) -> {
			System.out.println(e.getName() + " " + function.apply(e));
		});
		
		System.out.println(employees);
		
	}
}
