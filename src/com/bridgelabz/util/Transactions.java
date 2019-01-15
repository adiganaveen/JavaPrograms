package com.bridgelabz.util;

public class Transactions {
	private String date;
	private String transactionStatus;
	public Transactions()
	{
		date=null;
		transactionStatus=null;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
}
