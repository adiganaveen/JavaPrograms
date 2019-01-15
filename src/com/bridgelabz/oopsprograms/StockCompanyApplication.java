package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StockPersonManagement;

public class StockCompanyApplication {
	public static void main(String[] args) throws IOException {
		StockPersonManagement stockPersonManagement=new StockPersonManagement();
		boolean run = true;
		while (run == true)
		{
			System.out.println("****************STOCK COMPANY APPLICATION********************");
		System.out.println("1.Create Personel Account\n2.Open Personnel Account\n3.Exit");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:stockPersonManagement.createPersonalAccount();
			run = true;
			break;
		case 2:stockPersonManagement.openPersonnelAccount();
			run = true;
			break;
		case 3:
			System.out.println("Thank you");
			run = false;
			System.exit(0);
			break;
		default:
			System.out.println("Please select correct choice");
			run = true;
			break;
		}
		}
	}
}
