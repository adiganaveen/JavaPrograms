package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oopsprograms.StockCompanyApplication;

public class StockPersonManagement {
	StockPersonOperation stockPersonOperation = null;
	StockPerPerson stockPerPerson = null;
	static List<StockPerPerson> liOfStockPerPerson = new ArrayList<StockPerPerson>();
	File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
	static final String str = "/home/admin1/Documents/adiga_docs/New_Programs/JavaPrograms/";
	static String accountName = null;

	public static String getAccountName() {
		return accountName;
	}

	public static void setAccountName(String accountName) {
		StockPersonManagement.accountName = accountName;
	}

	public void createPersonalAccount() throws IOException {
		System.out.println(
				"Enter name of person account which has to be created with extension for security purpose (eg:file.json)");
		String book = OopsUtility.userString();
		File file = new File(str + book);
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("Account is created");
		} else {
			System.out.println("Account name already exists");
		}
	}

	public void openPersonnelAccount() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("enter your account name with extension for security purpose (.json)");
		String account = OopsUtility.userString();
		setAccountName(account);
		int flag = 0;
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (account.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Account Details");
					String string = OopsUtility.readFile(filename);
					liOfStockPerPerson = OopsUtility.userReadValue(string, StockPerPerson.class);
					insertDetails();
				} else {
					System.out.println("Account is empty");
					System.out.println("Add new data onto your Account");
					insertDetails();
				}
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Account doesnot exist or u have not given extention(.json)");
		}
	}

	public void insertDetails() throws JsonGenerationException, JsonMappingException, IOException {
		stockPersonOperation = new StockPersonOperation();
		boolean run = true;
		while (run == true) {
			System.out.println("1.Buy Stock\n2.Sell Stock\n3.Save\n4.Print\n5.Go back to main menu");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				stockPerPerson = stockPersonOperation.buyStock();
				liOfStockPerPerson.add(stockPerPerson);
				run = true;
				break;
			case 2:
				stockPersonOperation.sellStock();
				run = true;
				break;
			case 3:
				int flag = 0;
				String acc = getAccountName();
				for (File file : arrayOfFiles) {
					String filename = file.getName();
					if (acc.equals(filename)) {
						try {
							String json = OopsUtility.userWriteValueAsString(liOfStockPerPerson);
							OopsUtility.writeFile(json, filename);
							System.out.println("Account Updated");
							flag = 1;
						} catch (Exception e) {
							System.out.println("Cannot write to file");
						}
					}
				}
				if (flag == 0) {
					System.out.println("File doesnot exist or u have not given extention(.json)");
				}

				run = true;
				break;
			case 4:
				stockPersonOperation.displayPerPersonStock();
				run = true;
				break;
			case 5:
				StockCompanyApplication.main(null);
				run = false;
				break;
			default:
				System.out.println("Please select correct choice");
				run = true;
				break;
			}
		}
	}
}
