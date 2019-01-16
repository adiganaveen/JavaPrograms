package com.bridgelabz.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPersonOperation {
	private StockPortfolio stockPortfolio = new StockPortfolio();
	private StockPersonOperation stockPersonOperation = new StockPersonOperation();
	private StockPerPerson stockPerPerson = null;
	private static LinkedList<String> linkedList = new LinkedList<String>();
	private static QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
	private static StackLinkedList<String> stackLinkedList = new StackLinkedList<String>();
	private static StackLinkedList<String> stackLinkedList2 = new StackLinkedList<String>();

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
				while (yes == true) {
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
				transactions.setTransactionStatus("purchased");
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

	public void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
		displayPerPersonStock();
		System.out.println("Enter the name to the stack to be sold");
		String sellStockName = OopsUtility.userString();
		int flag = 0;
		if (!StockPersonManagement.liOfStockPerPerson.isEmpty()) {
			for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
				if (sellStockName.equals(stockPerPerson.getStockName())) {
					System.out.println("Enter how many number of shares has to be sold");
					int share = OopsUtility.userInteger();
					boolean run = true;
					while (run == true) {
						if (stockPerPerson.getNumberOfStock() >= share) {
							stockPerPerson.setNumberOfStock(stockPerPerson.getNumberOfStock() - share);
							run = false;
						} else {
							System.out.println("enter valid number of shares");
							run = true;
						}
					}
					for (Stock stock : StockPortfolio.liOfStock) {
						if (stock.getStockName().equals(stockPerPerson.getStockName())) {
							stock.setNumberOfShare(stock.getNumberOfShare() + stockPerPerson.getNumberOfStock());
						}
						String json = OopsUtility.userWriteValueAsString(StockPortfolio.liOfStock);
						OopsUtility.writeFile(json, StockPortfolio.str);
					}
					sold(stockPerPerson, share);
					System.out.println("Stock has been removed from account ");
					break;
				}
				flag = 1;
			}

		} else {
			System.out.println("There are no stocks in account...!");
		}
		if (flag == 0) {
			System.out.println("Entered stock doesnot exist in account!!!");
		}
	}

	public static void sold(StockPerPerson stockPerPerson, int share) {
		StockPerPerson stockPerPerson2 = new StockPerPerson();
		stockPerPerson2.setStockName(stockPerPerson.getStockName());
		stockPerPerson2.setPrice(stockPerPerson.getPrice());
		stockPerPerson2.setNumberOfStock(share);
		Transactions transactions = new Transactions();
		transactions.setDate(OopsUtility.getDate());
		transactions.setTransactionStatus("sold");
		stockPerPerson2.setTransactions(transactions);
		StockPersonManagement.liOfStockPerPerson.add(stockPerPerson2);
	}

	public void displayPerPersonStock() throws FileNotFoundException {
		String string = OopsUtility.readFile(StockPersonManagement.getAccountName());
		try {
			StockPersonManagement.liOfStockPerPerson = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
			System.out.println("Stock     	   : " + stockPerPerson.getStockName());
			System.out.println("Number of shares   : " + stockPerPerson.getNumberOfStock());
			System.out.println("Stock price        : " + stockPerPerson.getPrice());
			System.out.println("Date      	   :" + stockPerPerson.getTransactions().getDate());
			System.out.println("Transaction status :" + stockPerPerson.getTransactions().getTransactionStatus());
			System.out.println("----------------------------------------------------");
		}
	}

	public void storeDynamic() throws FileNotFoundException {
		String string = OopsUtility.readFile(StockPersonManagement.getAccountName());
		try {
			StockPersonManagement.liOfStockPerPerson = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (StockPerPerson stockPerPerson : StockPersonManagement.liOfStockPerPerson) {
			linkedList.add(stockPerPerson.getStockName());
			queueLinkedList.enqueue(stockPerPerson.getTransactions().getDate());
			stackLinkedList.push(stockPerPerson.getTransactions().getTransactionStatus());
		}

	}

	public void displayDynamic() throws FileNotFoundException {
		storeDynamic();
		System.out.println("Stock Name Bought with Date and Time and Transaction report is below :");
		System.out.print("Stock Name : ");
		linkedList.getLikedList();
		System.out.println();
		System.out.print("Date       : ");
		for (int i = 0; i < queueLinkedList.getSize(); i++) {
			System.out.print(queueLinkedList.dequeue() + "\t");
		}
		System.out.println();
		while (!stackLinkedList.isEmpty()) {
			stackLinkedList2.push(stackLinkedList.pop());
		}
		System.out.print("Status     : ");
		while (!stackLinkedList2.isEmpty()) {
			System.out.print(stackLinkedList2.pop() + "\t\t\t");
		}
		System.out.println(
				"\n---------------------------------------------------------------------------------------------------------");
	}
}
