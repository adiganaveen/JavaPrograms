package com.bridgelabz.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPersonOperation {
	private static StockPerPerson stockPerPerson = null;
	private static LinkedList<String> linkedList = new LinkedList<String>();
	private static QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
	private static StackLinkedList<String> stackLinkedList = new StackLinkedList<String>();
	private static StackLinkedList<String> stackLinkedList2 = new StackLinkedList<String>();

	public static StockPerPerson buyStock() throws JsonGenerationException, JsonMappingException, IOException {
		StockPortfolio.displayStock();
		System.out.println("Select the stock name which has to be bought");
		String name = OopsUtility.userString();
		boolean flag = false;
				Optional<Stock> optional = StockPortfolio.stocks.parallelStream()
						.filter(stock -> name.equals(stock.getStockName())).findAny();
				if (optional.isPresent()) {
				flag = true;
				return buyingStock(optional.get());
			}
		if (!flag) {
			System.out.println("Stock name not found");
		}
		return null;
	}

	public static StockPerPerson buyingStock(Stock stock) throws JsonGenerationException, JsonMappingException, IOException
	{
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
				String json = OopsUtility.userWriteValueAsString(StockPortfolio.stocks);
				OopsUtility.writeFile(json, StockPortfolio.STOCK_PATH);
				break;
			} else {
				System.out.println("That amount of shares doesnot exist!!!");
				yes = true;
			}
		}
		System.out.println("number of stocks setted");
		stockPerPerson.setPrice(stock.getSharePrice());
		stockPerPerson.setTransactions(transactions("purchased"));
		return stockPerPerson;
	}
	public static Transactions transactions(String status)
	{
		Transactions transactions = new Transactions();
		transactions.setDate(OopsUtility.getDate());
		transactions.setTransactionStatus(status);
		return transactions;
	}
	public void sellStock() throws JsonGenerationException, JsonMappingException, IOException {
		displayPerPersonStock();
		System.out.println("Enter the name to the stack to be sold");
		String sellStockName = OopsUtility.userString();
		boolean flag = false;
		if (!StockPersonManagement.stockPersons.isEmpty()) {
			for (StockPerPerson stockPerPerson : StockPersonManagement.stockPersons) {
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
					for (Stock stock : StockPortfolio.stocks) {
						if (stock.getStockName().equals(stockPerPerson.getStockName())) {
							stock.setNumberOfShare(stock.getNumberOfShare() + stockPerPerson.getNumberOfStock());
						}
						String json = OopsUtility.userWriteValueAsString(StockPortfolio.stocks);
						OopsUtility.writeFile(json, StockPortfolio.STOCK_PATH);
					}
					sold(stockPerPerson, share);
					System.out.println("Stock has been removed from account ");
					break;
				}
				flag = true;
			}

		} else {
			System.out.println("There are no stocks in account...!");
		}
		if (!flag) {
			System.out.println("Entered stock doesnot exist in account!!!");
		}
	}

	public static void sold(StockPerPerson stockPerPerson, int share) {
		StockPerPerson stockPerPerson2 = new StockPerPerson();
		stockPerPerson2.setStockName(stockPerPerson.getStockName());
		stockPerPerson2.setPrice(stockPerPerson.getPrice());
		stockPerPerson2.setNumberOfStock(share);
		stockPerPerson2.setTransactions(transactions("sold"));
		StockPersonManagement.stockPersons.add(stockPerPerson2);
	}

	public void displayPerPersonStock() throws FileNotFoundException {
		String string = OopsUtility.readFile(StockPersonManagement.accountName);
		try {
			StockPersonManagement.stockPersons = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (StockPerPerson stockPerPerson : StockPersonManagement.stockPersons) {
			System.out.println("Stock     	   : " + stockPerPerson.getStockName());
			System.out.println("Number of shares   : " + stockPerPerson.getNumberOfStock());
			System.out.println("Stock price        : " + stockPerPerson.getPrice());
			System.out.println("Date      	   :" + stockPerPerson.getTransactions().getDate());
			System.out.println("Transaction status :" + stockPerPerson.getTransactions().getTransactionStatus());
			System.out.println("----------------------------------------------------");
		}
	}

	public void storeDynamic() throws FileNotFoundException {
		String string = OopsUtility.readFile(StockPersonManagement.accountName);
		try {
			StockPersonManagement.stockPersons = OopsUtility.userReadValue(string, Stock.class);
		} catch (Exception e) {
			System.out.println("File is empty!!! Nothing in data to display");
		}
		for (StockPerPerson stockPerPerson : StockPersonManagement.stockPersons) {
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
		System.out.print("\nDate       : ");
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
