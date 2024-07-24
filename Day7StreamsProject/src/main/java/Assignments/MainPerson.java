package Assignments;

import java.util.HashSet;
import java.util.stream.Stream;

public class MainPerson {

	public static void main(String[] args) {

		
		HashSet<Person> hs = new HashSet<Person>();
		
	 	Person person1 = new Person("Alice", 30, "New York", 1234567890L);
        Person person2 = new Person("Bob", 14, "Los Angeles", 2345678901L);
        Person person3 = new Person("Charlie", 35, "Chicago", 3456789012L);
        Person person4 = new Person("Ali", 13, "New York", 1234567890L);
        Person person5 = new Person("Bond", 5, "Los Angeles", 2345678901L);
        Person person6 = new Person("Chavi", 65, "Chicago", 3456789012L);
	
        
        hs.add(person1);
        hs.add(person2);
        hs.add(person3);
        hs.add(person4);
        hs.add(person5);
        hs.add(person6);

 
		hs.stream().filter(i->{
			try{if(i.getAge()<18)
				throw new AgeNotSufficientException("Age should be greater than 18 to vote");
			}catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
			return true;
		}).forEach(System.out::println);;

}
	
}
