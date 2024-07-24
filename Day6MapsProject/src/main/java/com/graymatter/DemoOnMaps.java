package com.graymatter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(5, "karthik");
		hm.put(9, "mohan");
		hm.put(2, "Shruthi");
		
		System.out.println(hm);
		System.out.println(hm.get(4));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		//hm.put(null, "sad");
		//System.out.println(hm.get(null));
		hm.put(7, "swapna");
		hm.put(6, "swathi");
		
		//Iterator for hm
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Entry<Integer, String> entry: entrySet) {
	
			System.out.println( entry.getKey() + " " + entry.getValue());
		}
		
		hm.remove(7);
		hm.replace(5, "karthik", "naamerea");
		System.out.println(hm);
		
		

//		Address add = new Address("")

		Employee e1 = new Employee("karthik", 3, 30000d, "bengaluru");
		Employee e2 = new Employee("harsha", 2, 40000d, "Delhi");
		Employee e3 = new Employee("naman", 5, 33000d, "bengaluru");
		Employee e4 = new Employee("dhanya", 1, 50000d, "bengaluru");
		Employee e5 = new Employee("thomas", 6, 67000d, "Delhi");
		Employee e6 = new Employee("milton", 7, 70000d, "Delhi");
		
		TreeMap<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();
		treeMap.put(3, e1);
		treeMap.put(5, e2);
		treeMap.put(2, e3);
		treeMap.put(8, e4);
		treeMap.put(4, e5);
		treeMap.put(9, e6);
		for(Entry<Integer, Employee> e: treeMap.entrySet() ) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		//Employee needs to have comparable when as its user defined
		TreeMap<Employee, Address> myMap = new TreeMap<Employee, Address>();
		
		Address add = new Address("Hyd", "telangana");
		
		myMap.put(e1, add);
		myMap.put(e2, add);

		System.out.println(myMap);
		
		
	}

}
