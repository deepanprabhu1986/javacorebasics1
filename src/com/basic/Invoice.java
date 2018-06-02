package com.basic;

public class Invoice {
	String partNumber;
	String partDescripton;
	Double priceperItem;
	int itemQuantity;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescripton() {
		return partDescripton;
	}
	public void setPartDescripton(String partDescripton) {
		this.partDescripton = partDescripton;
	}
	public Double getPriceperItem() {
		return priceperItem;
	}
	public void setPriceperItem(Double priceperItem) {
		this.priceperItem = priceperItem;
		if(this.priceperItem<0) {
			this.priceperItem=0.0;
		}
	
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
		if(this.itemQuantity<0) {
			this.itemQuantity=0;
		}
	}
	public double getInvoiceAmount() {
		return this.itemQuantity*this.priceperItem;
	}
public static void main (String args[]) {
	Invoice i1=new Invoice();
	i1.setItemQuantity(12);
	i1.setPriceperItem(10.0);
	System.out.println("invoice amount is"+i1.getInvoiceAmount());
	
	
}
}
