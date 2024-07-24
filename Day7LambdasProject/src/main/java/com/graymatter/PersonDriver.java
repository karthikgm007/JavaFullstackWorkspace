package com.graymatter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonDriver {

	public static void main(String[] args) {

		 ArrayList<Person> people = new ArrayList<>();
	        
	        // Adding 5 persons to the ArrayList
	        people.add(new Person("aohn Doe", 35, LocalDate.of(1994, 8, 21)));
	        people.add(new Person("Aane Smith", 29, LocalDate.of(1999, 3, 15)));
	        people.add(new Person("Michael Johnson", 40, LocalDate.of(1984, 5, 10)));
	        people.add(new Person("Amily Brown", 33, LocalDate.of(2002, 11, 25)));
	        people.add(new Person("David Wilson", 28, LocalDate.of(1996, 7, 7)));
	        
	        Predicate<Person> predicate = (Person) -> (Person.getAge()>30 && (Person.getName().charAt(0)=='A') ||Person.getName().charAt(0)=='a');
	        for(Person p: people) {
	        	if(predicate.test(p)) {
	        		System.out.println(p);
	        	}
	        }
	
	}

}
