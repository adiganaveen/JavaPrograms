package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.oopsprograms.AddressBookApplication;

public class AddressBookManager {
	private static final String ADDRESS_BOOK_FILE_PATH = "/home/admin1/Documents/adiga_docs/New_Programs/JavaPrograms/";
	private static final AddressBookManager ADDRESS_BOOK_MANAGER = null;
	private AddressBook addressBook = null;
	private static List<AddressBook> addressBooks = new ArrayList<AddressBook>();
	private static List<Person> persons = new ArrayList<Person>();
	private static String bookName = null;

	private AddressBookManager() {
	}

	public static AddressBookManager getInstance() {
		if (ADDRESS_BOOK_MANAGER == null) {
			return new AddressBookManager();
		}
		return ADDRESS_BOOK_MANAGER;
	}

	public void createBook() throws IOException {
		System.out.println("Enter name of address book with extension (eg:file.json)");
		String book = OopsUtility.userString();
		File file = new File(ADDRESS_BOOK_FILE_PATH + book);
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public void openBook() throws IOException {
		File[] files = getFiles();
		selectAddressBookName();
		boolean flag = false;
		for (File file : files) {
			String filename = file.getName();
			if (bookName.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Add Details");
					String string = OopsUtility.readFile(filename);
					persons = OopsUtility.userReadValue(string, Person.class);
				} else {
					System.out.println("Address Book is empty..!!");
				}
				insertAddressBook(persons);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("File doesnot exist or u have not given extention(.json)");
		}
	}

	private File[] getFiles() {
		return new File(System.getProperty("user.dir")).listFiles();
	}

	public void selectAddressBookName() {
		File[] files = getFiles();
		System.out.println("Files available are:");
		for (File file : files) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book");
		bookName = OopsUtility.userString();
	}

	public void insertAddressBook(List<Person> persons) throws IOException {
		addressBook = new AddressBook(persons);
		do {
			System.out.println(
					"select choice\n1.Add 2.Edit 3.Display 4.Delete 5.Sort 6.Go to Main Page");
			int i = OopsUtility.userInteger();
			switch (i) {
			case 1:
				addressBook.addPerson();
				break;
			case 2:
				addressBook.editPerson();
				break;
			case 3:
				addressBook.displayAddress();
				break;
			case 4:
				addressBook.deletePerson();
				break;
			case 5:
				sort();
				break;
			case 6:
				addressBook = null;
				AddressBookApplication.main(null);
				break;
			default:
				System.out.println("no choice");
				break;
			}
		} while (addressBook != null);
		addressBooks.add(addressBook);
	}

	public void sort() {
		System.out.println("select choice\n1.Sort By Last Name 2.Sort By Zip code");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			addressBook.sortByLastName();
			break;
		case 2:
			addressBook.sortByZipCode();
			break;
		}
	}

	public void saveBook() {
		File[] files = getFiles();
		int flag = 0;
		for (File file : files) {
			String filename = file.getName();
			if (bookName.equals(filename)) {
				try {
					String json = OopsUtility.userWriteValueAsString(persons);
					OopsUtility.writeFile(json, filename);
					System.out.println("Address book details saved");
					flag = 1;
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}

		if (flag == 0) {
			System.out.println("File doesnot exist or u have not given extention(.json)");
		}
	}

	public void saveAsBook() throws IOException {
		selectAddressBookName();
		System.out.println("Enter the file name to be saved with extension (eg:file.json)");
		String book = OopsUtility.userString();
		File file = new File(ADDRESS_BOOK_FILE_PATH + book);
		if (file.createNewFile()) {
			System.out.println("File is created");
			String json = OopsUtility.userWriteValueAsString(persons);
			OopsUtility.writeFile(json, book);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public void closeBook() {
		System.out.println("Would you like to save the changes? Y / N");
		String answer = OopsUtility.userString();
		if (answer.equalsIgnoreCase("Y")) {
			saveBook();
		}
		addressBook = null;
	}

}
