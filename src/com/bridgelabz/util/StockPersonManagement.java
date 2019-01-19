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
	private static StockPersonOperation stockPersonOperation = null;
	static List<StockPerPerson> stockPersons = new ArrayList<StockPerPerson>();
	private static final String str = "/home/admin1/Documents/adiga_docs/New_Programs/JavaPrograms/";
	static String accountName = null;

	private File[] getFiles() {
		return new File(System.getProperty("user.dir")).listFiles();
	}

	public void createPersonalAccount() throws IOException {
		System.out.println(
				"Enter name of person account which has to be created with extension for security purpose (eg:file.json)");
		String book = OopsUtility.userString();
		File file = new File(str + book);
		if (file.createNewFile()) {
			System.out.println("Account is created\n Restart and Open your account with your account name given...!");
		} else {
			System.out.println("Account name already exists");
		}
	}

	public void openPersonnelAccount() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("enter your account name with extension for security purpose (.json)");
		accountName = OopsUtility.userString();
		File[] files = getFiles();
		boolean flag = false;
		for (File file : files) {
			if (accountName.equals(file.getName())) {
				if (file.length() > 0) {
					System.out.println("Account Details");
					String string = OopsUtility.readFile(file.getName());
					stockPersons = OopsUtility.userReadValue(string, StockPerPerson.class);
				} else {
					System.out.println("Account is empty");
					System.out.println("Add new data onto your Account");
				}
				insertDetails();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Account doesnot exist or u have not given extention(.json)");
		}
	}

	public void insertDetails() throws JsonGenerationException, JsonMappingException, IOException {
		stockPersonOperation = new StockPersonOperation();
		do {
			System.out.println(
					"1.Buy Stock\n2.Sell Stock\n3.Save\n4.Display Account Details\n5.Transaction Report\n6.Go back to main menu");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				StockPerPerson stockPerPerson = stockPersonOperation.buyStock();
				stockPersons.add(stockPerPerson);
				break;
			case 2:
				stockPersonOperation.sellStock();
				break;
			case 3:
				save();
				break;
			case 4:
				stockPersonOperation.displayPerPersonStock();
				break;
			case 5:
				stockPersonOperation.displayDynamic();
				break;
			case 6:
				stockPersonOperation = null;
				StockCompanyApplication.main(null);
				break;
			default:
				System.out.println("Please select correct choice");
				break;
			}
		} while (stockPersonOperation != null);
	}

	public void save() {
		boolean flag = false;
		File[] files = getFiles();
		for (File file : files) {
			String filename = file.getName();
			if (accountName.equals(filename)) {
				try {
					String json = OopsUtility.userWriteValueAsString(stockPersons);
					OopsUtility.writeFile(json, filename);
					System.out.println("Account Updated");
					flag = true;
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}
		if (!flag) {
			System.out.println("File doesnot exist or u have not given extention(.json)");
		}
	}
}
