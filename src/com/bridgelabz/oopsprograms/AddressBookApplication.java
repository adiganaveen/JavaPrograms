/******************************************************************************
 *  Compilation:  javac -d bin AddressBookApplication.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.AddressBookApplication
 *  
 *  Purpose: Address Book Application
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressBookManager;
import com.bridgelabz.util.OopsUtility;

public class AddressBookApplication {
	
	public static void main(String[] args) throws IOException {

		AddressBookManager addressBookManager = null;
		System.out.println("***********Address Page***********");
		do{
			System.out.println("1.Create Book 2.Open Book 3.Save Book 4.Save As Book 5.Close Book 6.exit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				addressBookManager = AddressBookManager.getInstance();
				addressBookManager.createBook();
				break;
			case 2:
				addressBookManager = AddressBookManager.getInstance();
				addressBookManager.openBook();
				break;
			case 3:
				addressBookManager = AddressBookManager.getInstance();
				addressBookManager.saveBook();
				break;
			case 4:
				addressBookManager = AddressBookManager.getInstance();
				addressBookManager.saveAsBook();
				break;
			case 5:
				addressBookManager = AddressBookManager.getInstance();
				addressBookManager.closeBook();
				System.out.println("Book Closed");
				break;
			case 6:
				addressBookManager = null;
				System.exit(0);
				break;
			default:
				System.out.println("Please select correct choice");
			}
		}while(addressBookManager != null);

	}
}
