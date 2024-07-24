package Assignments;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DriverLinkedHashSet {
public static void main(String[] args) {
	LinkedHashMap<Integer, Employee> lhm = new LinkedHashMap<>();
	Employee e1 = new Employee(1001, "John Doe", 75000, "New York");
	Employee e2 = new Employee(1002, "Jane Smith", 80000, "Los Angeles");
	Employee e3 = new Employee(1003, "Michael Johnson", 60000, "Chicago");
	Employee e4 = new Employee(1004, "Emily Davis", 70000, "San Francisco");
	Employee e5 = new Employee(1005, "David Brown", 65000, "Boston");
	Employee e6 = new Employee(1006, "Jessica Wilson", 55000, "Seattle");
	Employee e7 = new Employee(1007, "Daniel Miller", 72000, "Austin");
	Employee e8 = new Employee(1008, "Sarah Martinez", 68000, "Miami");
	
	lhm.put(1, e1);
	lhm.put(2, e2);
	lhm.put(3, e3);
	lhm.put(4, e4);
	lhm.put(5, e5);
	lhm.put(6, e6);
	lhm.put(7, e7);
	lhm.put(8, e8);
	
	lhm.remove(4);
	for(Entry<Integer, Employee> e:lhm.entrySet())
	{
	System.out.println(e);
	}
	
	lhm.put(9, e8);
	for(Entry<Integer, Employee> e:lhm.entrySet())
	{
	System.out.println(e);
	}
	

	
	
	
}
}