package com.capgemini.onlineshopping.entity;

public class LineItem {

	private int quantity;
	private int productId;

	public LineItem() {
		super();
	}

	public LineItem(int quantity, int productId) {
		super();
		this.quantity = quantity;
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "LineItem [quantity=" + quantity + ", productId=" + productId + "]";
	}

	

}