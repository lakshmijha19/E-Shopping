package com.order.document;

public class Payment 
{
	private String type;
	private String cardDetails;
	
	public Payment(String type, String cardDetails) {
		super();
		this.type = type;
		this.cardDetails = cardDetails;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(String cardDetails) {
		this.cardDetails = cardDetails;
	}
	@Override
	public String toString() {
		return "Payment [type=" + type + ", cardDetails=" + cardDetails + "]";
	}
	
	
}
