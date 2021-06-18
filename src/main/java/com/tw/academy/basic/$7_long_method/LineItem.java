package com.tw.academy.basic.$7_long_method;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	double totalAmount() {
        return price * quantity;
    }

	@Override
	public String toString() {
		return description + "\t" + price + "\t" + quantity + "\t" + totalAmount() + "\n";
	}

	public double calculateTaxAmount() {
			return totalAmount() * OrderReceipt.TAX_RATE;
	}
}
