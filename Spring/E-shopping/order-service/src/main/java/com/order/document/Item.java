package com.order.document;

public class Item {
	String productName;
	double price;
	int quantity;
	
	public Item() {}
	
	public Item(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}

