package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainOrder {

	public static void main(String[] args) {

			Item item1 = new Item("Laptop", 5, 1200, "Dell");
	        Item item2 = new Item("Smartphone", 10, 800, "Samsung");
	        Item item3 = new Item("Headphones", 20, 100, "Sony");
	        Item item4 = new Item("Tablet", 8, 500, "Apple");
	        Item item5 = new Item("Keyboard", 15, 50, "Logitech");
	        Item item6 = new Item("Monitor", 3, 300, "LG");
	        Item item7 = new Item("Mouse", 25, 30, "Microsoft");
	        Item item8 = new Item("Printer", 2, 200, "Canon");
	        Item item9 = new Item("Speaker", 12, 150, "Bose");
	        Item item10 = new Item("Camera", 4, 1000, "Nikon");
	        
	        Order o1 = new Order();
	        
	        o1.addItem(item1);
	        o1.addItem(item2);
	        o1.addItem(item3);
	        o1.addItem(item4);
	        o1.addItem(item5);
	        
	        Order o2 = new Order();
	        
	        o2.addItem(item6);
	        o2.addItem(item7);
	        o2.addItem(item8);
	        
	        Order o3 = new Order();
	        o3.addItem(item9);
	        o3.addItem(item10);
	        
	        long o1Cost = o1.calcTotalOrderCost();
	        System.out.println(" Order Cost 1: " + o1Cost);
	        System.out.println(" Order Cost 2: " + o2.calcTotalOrderCost());
	        System.out.println(" Order Cost 3: " +o3.calcTotalOrderCost());
	        
	        ArrayList<Order> orderList = new ArrayList<Order>(Arrays.asList(o1, o2, o3));
	        
	        Iterator<Order> itr = orderList.iterator();
	        
	        Order maxOrder = new Order();
	        long maxOrderTotal=0;
	        while(itr.hasNext())
	        {
	     	   Order o = itr.next();
			if(o.calcTotalOrderCost() > maxOrderTotal)
	     	   {
	     		   maxOrderTotal=o.calcTotalOrderCost();
	     		   maxOrder = o;
	     	   }
	        }
	        
	        System.out.println("Max Total Order is: " + maxOrder.getOrderid() + "with total order value of " + maxOrderTotal);;
	        
	}

}
