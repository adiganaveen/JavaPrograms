package com.bridgelabz.oopsprograms;

public class Stock {
	private String stockName;
	private int numberOfShare;
	private double sharePrice;

	public Stock() {
		stockName = null;
		numberOfShare = 0;
		sharePrice = 0.0;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

}
