package com.graymatter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class DemoOnSets {

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<Integer>();
		
				hs.add(56);
				hs.add(34);
				hs.add(88);
				hs.add(67);
				
				System.out.println(hs);
				
				hs.add(34);
				hs.add(null);
				System.out.println(hs);
				
				Iterator<Integer> itr = hs.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				HashSet<Integer> hs1 = (HashSet<Integer>) hs.clone();
				
				Object[] intArr = hs.toArray();

				for(Object i: intArr) {
					System.out.println(i);
				}
				
				TreeSet<Integer> ts = new TreeSet<Integer>();
				
				ts.add(2);
				ts.add(8);
				ts.add(54);
				ts.add(6);
				ts.add(65);
				System.out.println(ts);
				
				Iterator<Integer> itr1 = ts.descendingIterator();
				while (itr1.hasNext()) {
					System.out.println(itr1.next());
				}
//				
//				ArrayList<Employee> empList = new ArrayList<Employee>();
//				
//
//				Employee e1 = new Employee("karthik", 3, 30000d, "bengaluru");
//				Employee e2 = new Employee("harsha", 2, 40000d, "Delhi");
//				Employee e3 = new Employee("naman", 5, 33000d, "bengaluru");
//				Employee e4 = new Employee("dhanya", 1, 50000d, "bengaluru");
//				Employee e5 = new Employee("thomas", 6, 67000d, "Delhi");
//				Employee e6 = new Employee("milton", 7, 70000d, "Delhi");
//				
//				empList.add(e1);
//				empList.add(e2);
//				empList.add(e3);
//				empList.add(e4);
//				empList.add(e5);
//				empList.add(e6);
//				
//				TreeSet<Employee> ts1 = new TreeSet<Employee>();
//				ts1.add(e1);
//				ts1.add(e2);
//				ts1.add(e3);
//				ts1.add(e4);
//				ts1.add(e5);
//				ts1.add(e6);
//				
//
//				for(Employee e: ts1)
//					System.out.println(e);
//				
				TreeSet<Integer> ts2 = new TreeSet<Integer>();
				ts2.add(41);
				ts2.add(33);
				ts2.add(22);
				
				System.out.println(ts2.ceiling(60));
				System.out.println(ts2.floor(60));
				ts2.add(56);
				ts2.add(43);
				ts2.add(39);
				System.out.println(ts2.headSet(57));
				System.out.println(ts2.tailSet(57));

				
				
	}
}
 