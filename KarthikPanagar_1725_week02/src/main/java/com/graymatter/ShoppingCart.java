package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList; 

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShoppingCart {
	
	private ArrayList<Item> items;
	private boolean coupon=false;
	
 
	 public void addToCart(Item item) { 
	 //write code here 
		 if(items==null) {
			 items = new ArrayList<Item>();
		 }
		 items.add(item);
	 } 
	 
	 public void showCart() { 
	 //write code here 
		 items.stream().forEach(i-> System.out.println(i.getProductName() + ": " + i.getQuantity()));
		 
	 } 
	 
	 public void removeFromCart(Item i) { 
	 //write code here 
		 items.remove(i);
		 
	 } 
	 
	 public double getTotalAmount() { 
	 //write code here 
		 double totalAmount =  items.stream()
                 .mapToDouble(item -> item.getUnitPrice() * item.getQuantity())
                 .sum();
		 return totalAmount;
	 } 
	 
	 public void applyCoupon(String coupon) throws CouponNotValidExeption { 
	 //write code here 
		 if(coupon == "IND10") {
			 this.coupon = true;
		 }
		 else {
			 System.out.println("This Coupon is Invalid. Discount Not Applied.");
//			 throw new CouponNotValidExeption("This Coupon is Invalid. Provide a valid coupon for discount.");
		 }
		 
	 } 
	 
	 public double getPayableAmount() { 
	 //write code here 
		 double payableAmount;
		 double taxRate = 0.14; //14% tax
		 double discount = this.coupon ? 0.10 : 0; //10% discount
		 double totalAmount = getTotalAmount();
		 
		 
		 double taxableAmount = totalAmount - discount * totalAmount;
		 payableAmount = taxableAmount + taxRate*taxableAmount ;
		 
		 return payableAmount;
	 } 

	 public void printInvoice() { 
		    double totalAmount = getTotalAmount(); 
		    double discount = coupon ? 0.10 : 0; 
		    double taxRate = 0.14; //14% tax

		    items.forEach(item -> {
		        double itemTotal = item.getUnitPrice() * item.getQuantity();
		        System.out.printf("%s %d %.2f %.2f\n", item.getProductName(), item.getQuantity(), item.getUnitPrice(), itemTotal);
		    });

		    double discountAmount = totalAmount*discount;
		    double discountedAmount = totalAmount-discountAmount;
		    double taxAmount = discountedAmount*taxRate;
		    double finalAmount = discountedAmount+ taxAmount;

		    System.out.printf("Total: %.2f\n", totalAmount);
		    System.out.printf("Disc%%: %.2f\n", discountAmount);
		    System.out.printf("Tax: %.2f\n", taxAmount);
		    System.out.printf("Total: %.2f\n", finalAmount);
		}

}


