package com.springdemos.springcore.challenge;

public class shoppingCart {
private String customerName;
private Item item;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
@Override
public String toString() {
	return "shoppingCart [customerName=" + customerName + ", item=" + item + "]";
}

}
