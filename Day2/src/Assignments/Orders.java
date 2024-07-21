package Assignments;

import java.util.Arrays;

public class Orders {
private int orderId;
private float price;
private String custName;
Items []it;
public Orders() {
	super();
}
public Orders(int orderId, float price, String custName, Items it[]) {
	super();
	this.orderId = orderId;
	this.price = price;
	this.custName = custName;
	this.it=it;
	
}
@Override
public String toString() {
	return "Orders [orderId=" + orderId + ", price=" + price + ", custName=" + custName + ", it=" + Arrays.toString(it)
			+ "]";
}



}