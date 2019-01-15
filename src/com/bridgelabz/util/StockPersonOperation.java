package com.bridgelabz.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPersonOperation {
	StockPortfolio stockPortfolio = null;
	StockPersonOperation stockPersonOperation = null;
	StockPerPerson stockPerPerson = null;

	public StockPerPerson buyStock() throws JsonGenerationException, JsonMappingException, IOException {
		stockPersonOperation = new StockPersonOperation();
		stockPortfolio = new StockPortfolio();
		StockPortfolio.displayStock();
		System.out.println("Select the stock name which has to be bought");
		String name = OopsUtility.userString();
		int flag = 0;
		for (Stock stock : StockPortfolio.liOfStock) {
			if (name.equals(stock.getStockName())) {
				System.out.println("Stock found");
				System.out.println("adding to your account");
				stockPerPerson = new StockPerPerson();
				stockPerPerson.setStockName(stock.getStockName());
				boolean yes = true;
				while (yes = true) {
					System.out.println("Select number of shares");
					int share = OopsUtility.userInteger();
					if (stock.getNumberOfShare() >= share) {
						stockPerPerson.setNumberOfStock(share);
						stock.setNumberOfShare(stock.getNumberOfShare() - share);
						yes = false;
						String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
						OopsUtility.writeFile(json, StockPortfolio.str);
						break;
					} else {
						System.out.println("That amount of shares doesnot exist!!!");
						yes = true;
					}
				}
				System.out.println("number of stocks setted");
				stockPerPerson.setPrice(stock.getSharePrice());
				Transactions transactions = new Transactions();
				transactions.setDate(OopsUtility.getDate());
				transactions.setTransactionStatus("stock added");
				stockPerPerson.setTransactions(transactions);
				flag = 1;
				return stockPerPerson;
			}
		}
		if (flag == 0) {
			System.out.println("Stock name not found");
		}
		return null;
	}
}
