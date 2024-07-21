package Assignments;

public class Items {
private String itemName;
private float itemValue;
public Items() {
	super();
}
public Items(String itemName, float itemValue) {
	super();
	this.itemName = itemName;
	this.itemValue = itemValue;
}
@Override
public String toString() {
	return "Items [itemName=" + itemName + ", itemValue=" + itemValue + "]";
}

}