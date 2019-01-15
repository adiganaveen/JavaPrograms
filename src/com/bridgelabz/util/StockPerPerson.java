package com.bridgelabz.util;

public class StockPerPerson {
	private String stockName;
	private int numberOfStock;
	private double price;
	private Transactions transactions;
	
	public StockPerPerson()
	{
		stockName=null;
		numberOfStock=0;
		price=0.0;
		transactions=null;
	}

	public Transactions getTransactions() {
		return transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
