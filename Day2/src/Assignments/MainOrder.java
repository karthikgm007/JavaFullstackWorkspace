package Assignments;

public class MainOrder {
public static void main(String[] args) {
	Items []it=new Items[3];
	
	it[0]=new Items("maggie",20);
	it[1]=new Items("cookies",50);
	it[2]=new Items("dates",120);
	
	Orders o=new Orders(117,190,"Harsha",it);
	System.out.println("Order Class Object");
	System.out.println(o);
	
	System.out.println("Item Class Object");
	for(Items i:it)
	System.out.println(i);
	
}
}