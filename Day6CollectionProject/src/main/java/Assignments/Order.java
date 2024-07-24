package Assignments;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {

	private int orderid;
	private LocalDate orderDate;
	private ArrayList<Item> itemList;
	
	public long calcTotalOrderCost() {
		
		long orderTotal = 0;
		for(Item item: this.itemList) {
			orderTotal += (item.getNou() * item.getPricePerUnit());
		}
		return orderTotal;
	}
	
	public void findMaxOrder() {
		

	}
	
	public void addItem(Item i) {
		if(itemList==null) 
			itemList = new ArrayList<Item>();
		itemList.add(i);
	}
}
