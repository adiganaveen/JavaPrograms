package com.bridgelabz.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPortfolio {
	static List<Stock> stocks = new ArrayList<Stock>();
	static Stock stock = null;
	static final String STOCK_PATH = "/home/admin1/Documents/adiga_docs/New_Programs/Files/stock.json";

	public static void addStock() throws JsonGenerationException, JsonMappingException, IOException {
		String string = OopsUtility.readFile(STOCK_PATH);
		try {
			stocks = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			System.out.println("Adding data.....");
		} catch (Exception e) {
			System.out.println("File is empty!");
			System.out.println("Adding data.....");
		}
		stock = new Stock();
		System.out.println("Enter the stock name");
		stock.setStockName(OopsUtility.userString());
		System.out.println("Enter total number of shares");
		stock.setNumberOfShare(OopsUtility.userInteger());
		System.out.println("Enter stock share price");
		stock.setSharePrice(OopsUtility.userDouble());
		stocks.add(stock);
		System.out.println("Stock added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(stocks);
		OopsUtility.writeFile(json, STOCK_PATH);
	}

	public static void displayStock() throws FileNotFoundException {
		String string = OopsUtility.readFile(STOCK_PATH);
		try {
			stocks = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : stocks) {
			System.out.println("Stock Name 			  : " + stock.getStockName());
			System.out.println("Total number of Stock 		  : " + stock.getNumberOfShare());
			System.out.println("Share Price			  : " + stock.getSharePrice());
			System.out.println("-------------------------------------------------------");
		}
	}

	public static void valueOfEachStock() throws FileNotFoundException {
		String string = OopsUtility.readFile(STOCK_PATH);
		try {
			stocks = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (Stock stock : stocks) {
			System.out.println("Stock Name 			  : " + stock.getStockName());
			System.out.println("Value of this stock is 		  :" + stock.getNumberOfShare() * stock.getSharePrice());
			System.out.println("------------------------------------------------------");
		}
	}

	public static void totalStockValue() throws FileNotFoundException {
		String string = OopsUtility.readFile(STOCK_PATH);
		try {
			stocks = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		double sum = 0;
		for (Stock stock : stocks) {
			sum += (stock.getNumberOfShare() * stock.getSharePrice());
		}
		System.out.println("Total value of stock is :" + sum + "\n");

	}

}
