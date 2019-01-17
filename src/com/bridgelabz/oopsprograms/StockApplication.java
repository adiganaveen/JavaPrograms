package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StockPortfolio;

public class StockApplication {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
//		StockPortfolio stockPortfolio=new StockPortfolio();
		int run = 0;
		do {
			System.out.println("*****************STOCK APPLICATION******************");
			System.out.println("1.Add Stock\n2.Display\n3.Value of each Stock\n4.Total Stock value\n5.Exit");
			System.out.println("****************************************************");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				StockPortfolio.addStock();
				break;
			case 2:
				StockPortfolio.displayStock();
				break;
			case 3:
				StockPortfolio.valueOfEachStock();
				break;
			case 4:
				StockPortfolio.totalStockValue();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please select correct choice");
				break;
			}
		} while (run < 1);
	}
}
