package com.bridgelabz.util;

public class Inventory {
	private String name;
	private float weight;
	private double price;

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public float getWeight() {
		return this.weight;
	}

	public double getPrice() {
		return this.price;
	}
}
