package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.CliniqueManager;
import com.bridgelabz.util.OopsUtility;

public class ClinicalManagement {
	public static void main(String[] args) throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Search  3:Take Appointment  4:Quit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				CliniqueManager.add();
				isRunning = true;
				break;
			case 2:
				CliniqueManager.search();
				isRunning = true;
				break;
			case 3:
				
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice");
				isRunning = false;
				break;
			}
}
	}
}
