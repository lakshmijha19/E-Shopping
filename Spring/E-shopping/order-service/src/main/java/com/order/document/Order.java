package com.order.document;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class Order {
	
	private String customerId;
	private long amount;
	private List<Item> items;
	private Payment payment;
	private String status;
	private String address;
	
	public Order(String customerId, long amount, List<Item> items, Payment payment, String status, String address) {
		this.customerId = customerId;
		this.amount = amount;
		this.items = items;
		this.payment = payment;
		this.status = status;
		this.address = address;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item>  items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", amount=" + amount + ", items=" + items + ", payment=" + payment
				+ ", status=" + status + ", address=" + address + "]";
	}

	
	
	
}
