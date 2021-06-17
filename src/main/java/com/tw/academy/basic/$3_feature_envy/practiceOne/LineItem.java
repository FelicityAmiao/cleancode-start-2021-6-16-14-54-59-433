package com.tw.academy.basic.$3_feature_envy.practiceOne;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public LineItem(String description, double p, int quantity) {
		super();
		this.description = description;
		this.price = p;
		this.quantity = quantity;
	}

	public double calculateSubTotal() {
		return getPrice() * getQuantity();
	}
}
