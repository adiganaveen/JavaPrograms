package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressBookManager;
import com.bridgelabz.util.OopsUtility;

public class AddressBookApplication {
	public static void main(String[] args) throws IOException {
		
		AddressBookManager addressBookApplication=new AddressBookManager();
		int n=0;
		System.out.println("***********Address Page***********");
		do {
			System.out.println("1.Create Book 2.Open Book 3.Save Book 4.Close Book 5.exit");
			int choice=OopsUtility.userInteger();
			switch(choice)
			{
			case 1:addressBookApplication.createBook();
				break;
			case 2:addressBookApplication.openBook();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:System.exit(0);
				break;
			default:System.out.println("Please select correct choice");
			}
		}while(n<30);
		
		
		
	}
}
