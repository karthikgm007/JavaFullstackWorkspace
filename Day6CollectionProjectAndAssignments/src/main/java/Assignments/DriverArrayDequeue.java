package Assignments;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class DriverArrayDequeue {
public static void main(String[] args) {
	
	
	 ArrayDeque<Customer> ad = new ArrayDeque<>();
     Customer c1 = new Customer(101, "Alice Johnson", true, 1500);
     Customer c2 = new Customer(102, "Bob Smith", false, 400);
     Customer c3 = new Customer(103, "Eve Brown", true, 1000);
     Customer c4 = new Customer(104, "Charlie Davis", false, 100);
     Customer c5 = new Customer(105, "Grace Lee", true, 2300);
	
	ad.add(c1);
	ad.add(c2);
	ad.add(c3);
	ad.add(c4);
	ad.add(c5);
	ad.push(c5);
	
	
	Iterator<Customer> i1=ad.iterator();
	while(i1.hasNext())
	System.out.println(i1.next());
	
	
	List<Customer> li = new ArrayList<>(ad);
	//sorting based on order value
	Collections.sort(li);
	
	System.out.println("After sort: ");
	
	Iterator<Customer> i2=li.iterator();
	while(i2.hasNext())
	System.out.println(i2.next());
	
	ad.remove();
	ad.remove(c5);
	
	System.out.println("Removed:");
	Iterator<Customer> i=ad.iterator();
	while(i.hasNext())
	System.out.println(i.next());
	
	
	
}
}
